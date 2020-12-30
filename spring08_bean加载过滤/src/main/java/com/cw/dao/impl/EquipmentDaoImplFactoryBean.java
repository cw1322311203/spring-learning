package com.cw.dao.impl;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 11:04
 *
 * TODO FactoryBean:对单一的bean的初始化过程进行封装，达到简化配置的目的
 *
 * FactoryBean与BeanFactory区别
 * - FactoryBean：封装单个bean的创建过程
 * - BeanFactory：Spring容器顶层接口，定义了bean相关的获取操作
 */
public class EquipmentDaoImplFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new EquipmentDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
