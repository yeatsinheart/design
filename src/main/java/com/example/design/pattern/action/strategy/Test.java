package com.example.design.pattern.action.strategy;

/**
 * @program: design
 * @description: this is a
 * @author: Yeats
 * @create: 2019-05-17 17:12
 **/
public class Test {
    public static void main(String[] args) {
        StrategyFactory strategyFactory = new StrategyFactory();
        //tag 代表了服务名称。如果有业务逻辑。可以使用业务逻辑来命名，通过annotation注释value来实现调用
        strategyFactory.getStrategyServiceByBusiness("BUSSINESS_1");
        strategyFactory.getStrategyServiceByServiceName("serviceName");
        System.out.println();
    }
}
