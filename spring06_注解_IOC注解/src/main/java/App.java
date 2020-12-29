import com.alibaba.druid.pool.DruidDataSource;
import com.cw.config.SpringConfig;
import com.cw.config.SpringConfig2;
import com.cw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 9:15
 */
public class App {
    public static void main(String[] args) {
        // 加载xml配置文件
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-back.xml");
        //加载纯注解格式上下文对象，需要使用AnnotationConfigApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class, SpringConfig2.class);
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();

//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();
//
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
