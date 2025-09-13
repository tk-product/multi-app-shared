package com.recipe.exception.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecipeApplicationException extends RuntimeException {

    private String debugCode;
    private String errorItem;
    private String errorCode;
    private Object placeholder;

    public RecipeApplicationException(String debugCode, String errorItem, String errorCode, Object... placeholder) {
        this.debugCode = debugCode;
        this.errorItem = errorItem;
        this.errorCode = errorCode;
        this.placeholder = placeholder;
    }

    public RecipeApplicationException(String debugCode, String errorCode, Object... placeholder) {
        this.debugCode = debugCode;
        this.errorCode = errorCode;
        this.placeholder = placeholder;
    }

    public RecipeApplicationException(String debugCode, String errorItem, String errorCode) {
        this.debugCode = debugCode;
        this.errorItem = errorItem;
        this.errorCode = errorCode;
    }

    public RecipeApplicationException(String debugCode, String errorCode) {
        this.debugCode = debugCode;
        this.errorCode = errorCode;
    }
}
