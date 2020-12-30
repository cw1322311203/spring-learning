import com.cw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 14:05
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println("---------save方法执行(获取参数)-----------");
        userService.save(666, 888);
        System.out.println("---------update方法执行(获取返回值)-----------");
        int ret = userService.update();
        System.out.println("app......" + ret);
        System.out.println("---------delete方法执行(获取异常数据)-----------");
        userService.delete();
    }
}
