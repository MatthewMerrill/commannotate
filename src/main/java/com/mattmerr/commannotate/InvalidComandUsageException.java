package com.mattmerr.commannotate;

public class InvalidComandUsageException extends RuntimeException {

  public InvalidComandUsageException() {
    super();
  }

  public InvalidComandUsageException(String message) {
    super(message);
  }

  public InvalidComandUsageException(Exception cause) {
    super(cause);
  }

  public InvalidComandUsageException(String message, Exception cause) {
    super(message, cause);
  }

}
