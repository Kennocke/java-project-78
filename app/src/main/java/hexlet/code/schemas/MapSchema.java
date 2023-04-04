package hexlet.code.schemas;

import java.util.Map;
import java.util.Objects;

public class MapSchema extends BaseSchema {
    public MapSchema() {
        super(Map.class);
    }

    public final MapSchema required() {
        validators.add(Objects::nonNull);
        return this;
    }

    public final MapSchema sizeof(int mapSize) {
        validators.add((Object obj) -> ((Map) obj).size() == mapSize);
        return this;
    }

    public final void shape(Map<String, BaseSchema> innerValidators) {
        validators.add((Object obj) -> {
            Map map = (Map) obj;
            for (Map.Entry<String, BaseSchema> entry : innerValidators.entrySet()) {
                if (!entry.getValue().isValid(map.get(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        });
    }
}
