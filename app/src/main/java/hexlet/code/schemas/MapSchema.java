package hexlet.code.schemas;

import java.util.Map;
import java.util.Objects;

public class MapSchema extends BaseSchema {
    public MapSchema() {
        super((Object obj) -> obj == null || obj instanceof Map);
    }

    public MapSchema required() {
        validators.add(Objects::nonNull);
        return this;
    }

    public MapSchema sizeof(int mapSize) {
        validators.add((Object obj) -> obj != null && ((Map) obj).size() == mapSize);
        return this;
    }
}
