package com.example.design.pattern.action.strategy;

import com.example.design.pattern.action.strategy.annotation.Strategy;
import com.example.design.pattern.action.strategy.service.StrategyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @program: design
 * @description: this is a
 * @author: Yeats
 * @create: 2019-05-17 17:13
 **/
public class StrategyFactory {
    @Autowired
    private Map<String, StrategyService> strategyServiceMap;
    @Autowired
    private List<StrategyService> strategyServiceList;
    @Resource
    private StrategyService defaultStrategy;

    public StrategyService getStrategyServiceByServiceName(String tag) {
        return strategyServiceMap.getOrDefault(tag, defaultStrategy);
    }

    //自定义tag。。可以考虑选定一些生成规则来区分  业务线--策略几
    public StrategyService getStrategyServiceByBusiness(String tag) {
        strategyServiceList.stream().filter(f -> {
            Strategy[] annotations = f.getClass().getAnnotationsByType(Strategy.class);
            Strategy strategy = Arrays.stream(annotations).filter(a -> StringUtils.equals(tag, a.value()))
                    .findFirst()
                    .orElse(null);
            return null == strategy ? false : true;
        }).findFirst().orElse(defaultStrategy);
        return strategyServiceMap.getOrDefault(tag, defaultStrategy);
    }
}
