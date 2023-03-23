package hexlet.code.schemas;

import java.util.Objects;

public class NumberSchema extends BaseSchema {
    public NumberSchema() {
        super((Object obj) -> obj == null || obj instanceof Number);
    }


    public NumberSchema positive() {
        validators.add((Object obj) -> obj == null || ((Number) obj).intValue() > 0);
        return this;
    }

    public NumberSchema required() {
        validators.add(Objects::nonNull);
        return this;
    }

    public NumberSchema range(int start, int end) {
        validators.add((Object obj) -> {
            if (obj == null) {
                return true;
            }

            int value = ((Number) obj).intValue();
            return value >= start && value <= end;
        });
        return this;
    }
}
