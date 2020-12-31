import com.cw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 17:21
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) ctx.getBean("userService");
        int ret = userService.save(1, 2);
        System.out.println("程序返回结果:"+ret);
    }
}
