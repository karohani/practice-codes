package com.tobyspring.chapter6.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class TxProxyFactoryBean implements FactoryBean<Object> {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    // isSingleton이 Default Method에 정의되어 있다.
}
