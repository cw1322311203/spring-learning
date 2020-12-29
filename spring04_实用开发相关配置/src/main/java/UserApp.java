import com.alibaba.druid.pool.DruidDataSource;
import com.cw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:06
 */
public class UserApp {
    public static void main(String[] args) {
        /*
            1.ApplicationContext是一个接口，提供了访问spring容器的API
            2.ClassPathXmlApplicationContext是一个类，实现了上述功能
            3.ApplicationContext的顶层接口是BeanFactory
            4.BeanFactory定义了bean相关的最基本操作
            5.ApplicationContext在BeanFactory基础上追加了若干新功能

            BeanFactory对比ApplicationContext
            1.BeanFactory创建的bean采用延迟加载形式，使用才创建(getBean)
            2.ApplicationContext创建的bean默认采用立即加载形式

            FileSystemXmlApplicationContext对比ClassPathXmlApplicationContext
            FileSystemXmlApplicationContext可以加载文件系统中任意位置的配置文件
            ClassPathXmlApplicationContext只能加载类路径下的配置文件

            BeanFactory的使用
            Resource res = new ClassPathResource("applicationContext.xml");
            BeanFactory bf = new XmlBeanFactory(res);
            UserService userService = (UserService)bf.getBean("userService");
         */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-book.xml","applicationContext-user.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();

        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getDriverClassName());
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getPassword());
    }
}
