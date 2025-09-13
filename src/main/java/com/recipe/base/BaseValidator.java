package com.recipe.base;

import com.recipe.exception.exception.RecipeApplicationException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.Objects;

public class BaseValidator {

    protected void commonValidate(Errors errors) {

        for (FieldError error : errors.getFieldErrors()) {
            String[] errorCodes = error.getCodes();
            String annotationValue = Objects.requireNonNull(errorCodes)[errorCodes.length - 1];

            switch (annotationValue) {
                case "NotNull" -> throw new RecipeApplicationException("VC001", error.getField(), "C001E00001");
                case "Pattern" -> throw new RecipeApplicationException("VC002", error.getField(), "C001E00002");
                default -> throw new RecipeApplicationException("VC003", error.getField(), "C001E00003");
            }
        }
    }
}
