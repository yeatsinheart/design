package com.example.design.pattern.action.strategy.service.impl;


import com.example.design.pattern.action.strategy.service.StrategyService;
import com.example.design.pattern.action.strategy.annotation.Strategy;
import org.springframework.stereotype.Component;

/**
 * @program: design
 * @description: this is a
 * @author: Yeats
 * @create: 2019-05-17 17:14
 **/
@Strategy("defaultStrategy")
@Strategy("xxBusinessDefaultStrategy")//业务编码。相同业务添加相同前缀
@Component
public class DefaultStrategy implements StrategyService {
}
