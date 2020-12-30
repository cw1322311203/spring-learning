package com.cw.dao.impl;

import com.cw.dao.EquipmentDao;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * TODO InitializingBean(bean的个性化处理)
 * - 作用：定义了每个bean的初始化前进行的动作，属于非统一性动作，TODO 用于对bean进行创建前业务处理
 * - 运行时机：当前操作伴随着任意一个bean的创建过程，保障其个性化业务处理
 */
public class EquipmentDaoImpl implements EquipmentDao, InitializingBean {

    public void save() {
        System.out.println("equipment dao running...");
    }

    @Override
    //定义当前bean初始化操作，功效等同于init-method属性配置
    public void afterPropertiesSet() throws Exception {
        SqlSessionFactoryBean fb;
        System.out.println("EquipmentDaoImpl......bean ...init......");
    }
}
