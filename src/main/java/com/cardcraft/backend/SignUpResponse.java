package com.cardcraft.backend;

import java.util.List;
import lombok.Data;

public class SignUpResponse {
    private List<String> errors;

    public void addError(String error) {
        errors.add(error);
    }

}
