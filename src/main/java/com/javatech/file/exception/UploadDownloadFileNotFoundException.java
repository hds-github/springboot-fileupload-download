package com.javatech.file.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UploadDownloadFileNotFoundException extends RuntimeException {
    public UploadDownloadFileNotFoundException(String message) {
        super(message);
    }

    public UploadDownloadFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
