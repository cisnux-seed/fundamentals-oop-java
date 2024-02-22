package cisnux.dev.utils;

import cisnux.dev.annotations.NotBlank;
import cisnux.dev.annotations.NotNull;
import cisnux.dev.data.LoginUser;
import cisnux.dev.errors.InvalidException;
import cisnux.dev.errors.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginUser loginUser) throws ValidationException, NullPointerException {
        if (loginUser.username() == null) {
            throw new NullPointerException("username cannot be null");
        }
        if (loginUser.username().isBlank()) {
            throw new ValidationException("username cannot be blank");
        }
        if (loginUser.password() == null) {
            throw new NullPointerException("password cannot be null");
        }
        if (loginUser.password().isBlank()) {
            throw new ValidationException("password cannot be blank");
        }
        if (loginUser.password().length() < 6) {
            throw new ValidationException("password must be at least 6");
        }
    }

    public static void validateRuntime(LoginUser loginUser) {
        if (loginUser.username() == null) {
            throw new NullPointerException("username cannot be null");
        }
        if (loginUser.username().isBlank()) {
            throw new InvalidException("username cannot be blank");
        }
        if (loginUser.password() == null) {
            throw new NullPointerException("password cannot be null");
        }
        if (loginUser.password().isBlank()) {
            throw new InvalidException("password cannot be blank");
        }
        if (loginUser.password().length() < 6) {
            throw new InvalidException("password must be at least 6");
        }
    }

    public static void validateReflection(Object obj) {
        final var aClass = obj.getClass();
        final var fields = aClass.getDeclaredFields();
        for (final var field : fields) {
            if (field.getAnnotation(NotNull.class) != null) {
                // to force the field to be accessible
                field.setAccessible(true);
                try {
                    final var fieldName = field.getName();
                    final var value = (String) field.get(obj);
                    if (value == null)
                        throw new InvalidException(fieldName + " must not be null");
                } catch (IllegalAccessException exception) {
                    throw new RuntimeException(exception);
                }
            }
            if (field.getAnnotation(NotBlank.class) != null) {
                field.setAccessible(true);
                try {
                    final var fieldName = field.getName();
                    final var value = (String) field.get(obj);
                    if (value.isBlank())
                        throw new InvalidException(fieldName + " must not be blank");
                } catch (IllegalAccessException exception) {
                    throw new RuntimeException(exception);
                }
            }
        }
    }
}