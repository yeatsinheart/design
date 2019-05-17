package com.example.design.pattern.action.strategy.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Strategies {
    Strategy[] value() ;
}
