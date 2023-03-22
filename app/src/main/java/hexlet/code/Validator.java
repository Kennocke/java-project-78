package hexlet.code;

import hexlet.code.schemas.StringSchema;

public class Validator {
    private  StringSchema currentValidator;

    public StringSchema string() {
        return new StringSchema();
    }
}
