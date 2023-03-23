package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public  class BaseSchema {
    protected final List<Predicate<?>> validators;

    public BaseSchema(Predicate<?> baseValidator) {
        validators = new ArrayList<>();
        validators.add(baseValidator);
    }

    public boolean isValid(Object obj) {
        for (Predicate validator : validators) {
            if (!validator.test(obj)) {
                return false;
            }
        }
        return true;
    }
}
