package com.cw.service.impl;

import com.cw.dao.BookDao;
import com.cw.dao.UserDao;
import com.cw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:00
 * @DependsOn - 微信订阅号，发布消息和订阅消息的bean的加载顺序控制
 * - 双11活动期间，零点前是结算策略A，零点后是结算策略B，策略B操作的数据为促销数据。策略B加载顺序与促销数据的加载顺序
 * @Lazy - 程序灾难出现后对应的应急预案处理是启动容器时加载时机
 * - 类型：类注解、方法注解
 * - 位置：bean定义的位置（类上或方法上）
 * - 作用：控制bean的加载时机，使其延迟加载
 * @Order - 多个种类的配置出现后，优先加载系统级的，然后加载业务级的，避免细粒度的加载控制
 */
//定义bean，后面添加bean的id
@Component("userService")//@Controller、@Service 、@Repository是@Component的衍生注解，功能同@Component
//设定bean的作用域
@Scope("singleton")//如果为singleton则可以只写@Scope
public class UserServiceImpl implements UserService {
    /*
        @Value注解可用在属性定义上方和方法定义上方
        说明：
        1.value值仅支持非引用类型数据，赋值时对方法的所有参数全部赋值
        2.value值支持读取properties文件中的属性值，通过类属性将properties中数据传入类中
        3.value值支持SpEL
        4.@value注解如果添加在属性上方，可以省略set方法（set方法的目的是为属性赋值）
     */
    private int num;

    @Value("cw")
    private String version;
    /*
        1.@Autowired默认按类型装配,类型相同时根据id来识别(和变量名相同的bean的id)，没有匹配的变量名则会报错，bean没有id可以用@Primary来提高优先级
        2.required：定义该属性是否允许为null
        3.@Inject与@Named是JSR330规范中的注解，功能与@Autowired和@Qualifier完全相同，适用于不同架构场景
        4.@Resource是JSR250规范中的注解，可以简化书写格式
          @Resource相关属性
            - name：设置注入的bean的id
            - type：设置注入的bean的类型，接收的参数为Class类型
     */
    @Autowired
    //指定@Qualifier后可以指定自动装配的bean的id
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired
    private BookDao bookDao;

    @Value("3")
    public void setNum(int num) {
        this.num = num;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UserServiceImpl() {
        System.out.println("service running...");
    }

    public void save() {
        System.out.println("user service running..." + num + " " + version);
        userDao.save();
        bookDao.save();
    }

    //设定bean的生命周期
    @PostConstruct// 相当于init-method属性
    public void init() {
        System.out.println("user service init...");
    }

    //设定bean的生命周期
    @PreDestroy // 相当于destroy-method属性
    public void destroy() {
        System.out.println("user service destroy...");
    }
}
