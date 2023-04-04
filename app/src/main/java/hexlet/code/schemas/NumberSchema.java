package hexlet.code.schemas;

import java.util.Objects;

public class NumberSchema extends BaseSchema {
    public NumberSchema() {
        super(Number.class);
    }


    public final NumberSchema positive() {
        validators.add((Object obj) -> obj == null || ((Number) obj).intValue() > 0);
        return this;
    }

    public final NumberSchema required() {
        validators.add(Objects::nonNull);
        return this;
    }

    public final NumberSchema range(int start, int end) {
        validators.add((Object obj) -> {
            int value = ((Number) obj).intValue();
            return value >= start && value <= end;
        });
        return this;
    }
}
