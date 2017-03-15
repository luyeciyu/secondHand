package com.yws.server.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by liuneng on 17-3-7.
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface Condition {
    String EQUAL = "=";
    String GT = ">";
    String LT = "<";
    String GE = ">=";
    String LE = "<=";
    String LIKE = "LIKE";

    String operator() default EQUAL;
}
