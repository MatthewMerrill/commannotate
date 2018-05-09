package com.mattmerr.commannotate;

public @interface Command {

  String scope() default "";

  String[] cmd();

  String usage();

  String help();

}
