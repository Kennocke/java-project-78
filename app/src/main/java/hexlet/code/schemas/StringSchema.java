package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;

public class StringSchema {
    private final Map<String, Object> validators;

    public StringSchema() {
        this.validators = new HashMap<>();
    }

    public boolean isValid(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }

        String sourceString = (String) obj;

        if (validators.containsKey("required") && sourceString == null) {
            return false;
        }

        if (validators.containsKey("minLength")
                && (obj == null
                || sourceString.length() < (int) validators.get("minLength"))) {
            return false;
        }

        if (validators.containsKey("contains")
                && obj != null
                && !sourceString.contains((String) validators.get("contains"))) {
            return false;
        }

        return true;
    }

    public StringSchema minLength(int minLength) {
        validators.put("minLength", minLength);
        return this;
    }

    public StringSchema required() {
        validators.put("required", null);
        return this;
    }

    public StringSchema contains(String partOfString) {
        validators.put("contains", partOfString);
        return this;
    }
}
