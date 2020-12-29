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
            单例时，加载容器时就创建对象
            非单例时，加载容器并不创建对象，获取对象(getBean)时才会创建
         */
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService = (UserService) ctx.getBean("userService");
        //UserService userService = (UserService) ctx.getBean("userService1");
        //UserService userService = (UserService) ctx.getBean("userService2");


//        UserService userService1 = (UserService) ctx.getBean("userService3");
//        UserService userService2 = (UserService) ctx.getBean("userService3");
//        UserService userService3 = (UserService) ctx.getBean("userService3");
//        System.out.println(userService1);
//        System.out.println(userService2);
//        System.out.println(userService3);
//        System.out.println(userService1 == userService2);// scope为singleton则为true,为prototype则为false


//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService1 = (UserService) ctx.getBean("userService3");
//        UserService userService2 = (UserService) ctx.getBean("userService3");
//        UserService userService3 = (UserService) ctx.getBean("userService3");
//        ctx.close();


//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService1 = (UserService) ctx.getBean("userService4");
//        userService1.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) ctx.getBean("userService5");
        userService1.save();

        //userService.save();
    }
}
