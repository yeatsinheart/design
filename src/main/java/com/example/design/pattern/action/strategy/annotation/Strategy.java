package com.example.design.pattern.action.strategy.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Strategies.class)
public @interface Strategy {
    String value() default "";
}
