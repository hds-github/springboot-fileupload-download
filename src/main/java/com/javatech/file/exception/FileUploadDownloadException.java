package com.javatech.file.exception;

public class FileUploadDownloadException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileUploadDownloadException(String message) {
        super(message);
    }

    public FileUploadDownloadException(String message, Throwable cause) {
        super(message, cause);
    }
}
