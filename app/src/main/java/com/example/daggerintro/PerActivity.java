package com.example.daggerintro;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;



/*
This is not a special annotation,it's identical to @Singelton but we have named it PerActivity so we should use this
in Components which will be declared in Activities so that it remains Singelton only to that activity..
 */


@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity { }
