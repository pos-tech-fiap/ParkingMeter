package com.fiap.postech.parkingmeter.controllers.exceptions;

import com.fiap.postech.parkingmeter.services.exceptions.DefaultError;

import java.util.ArrayList;
import java.util.List;

public class FormValidation extends DefaultError {

    private List<ValidationField> messages = new ArrayList<>();

    public List<ValidationField> getMessages() {
        return messages;
    }

    public void addMessages(String field, String message) {
        messages.add(new ValidationField(field, message));
    }
}
