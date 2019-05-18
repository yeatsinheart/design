package com.example.design.pattern.object.single.bean;

import com.example.design.pattern.object.single.Single;

/**
 * @program: design
 * @description: this is a
 * @author: Yeats
 * @create: 2019-05-18 13:23
 **/
public class DefaultBean implements Single {
    private static Single single ;
    static {
        if(null ==single){
            single = new DefaultBean() ;
        }
    }
    private DefaultBean(){}
    @Override
    public Single get() {
        return single;
    }
}
