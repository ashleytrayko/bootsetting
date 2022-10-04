package com.ko.personal.exception;

import org.springframework.security.authentication.AccountStatusException;

public class NoMemberException extends AccountStatusException {

    public NoMemberException() {
        super("해당 유저는 없습니다");
    }

    public NoMemberException(String message) {
        super(message);
    }

    public NoMemberException(String message, Throwable cause) {
        super(message, cause);
    }
}