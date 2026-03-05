package com.elastic.spring.infra.exception;

public class UserNotExistException extends RuntimeException {
  public UserNotExistException(String message) {
    super(message);
  }
}
