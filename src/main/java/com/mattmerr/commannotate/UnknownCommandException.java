package com.mattmerr.commannotate;

public class UnknownCommandException extends Exception {

  public UnknownCommandException(String command) {
    super("command not recognized: \"" + command +"\"");
  }

}
