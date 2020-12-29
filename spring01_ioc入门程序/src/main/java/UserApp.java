import com.cw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈小哥cw
 * @date 2020/12/25 17:06
 */
public class UserApp {
    public static void main(String[] args) {
        // 2.加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 3.获取资源
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
