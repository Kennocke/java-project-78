package hexlet.code.schemas;


public class StringSchema extends BaseSchema {
    public StringSchema() {
        super(String.class);
    }

    public final StringSchema minLength(int minLength) {
        validators.add((Object obj) -> !(((String) obj).length() < minLength));
        return this;
    }

    public final StringSchema required() {
        validators.add((Object obj) -> obj != null && !((String) obj).isEmpty());
        return this;
    }

    public final StringSchema contains(String partOfString) {
        validators.add((Object obj) -> ((String) obj).contains(partOfString));
        return this;
    }
}
