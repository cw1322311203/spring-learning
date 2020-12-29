import com.cw.config.SpringConfig;
import com.cw.domain.Account;
import com.cw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 16:40
 */
/*
    注解整合MyBatis步骤
    1.修改mybatis外部配置文件格式为注解格式
    2.业务类使用@Component声明bean，使用@Autowired注入对象
    3.建立配置文件JDBCConfig与MyBatisConfig类，并将其导入到核心配置类SpringConfig
    4.开启注解扫描
    5.使用AnnotationConfigApplicationContext对象加载配置项

    注解整合Junit
    1.从Spring5.0以后，要求Junit的版本必须是4.12及以上
    2.Junit仅用于单元测试，不能将Junit的测试类配置成spring的bean，否则该配置将会被打包进入工程中
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.getBean("dataSource");
        AccountService accountService = (AccountService) ctx.getBean("accountService");

        List<Account> accountList = accountService.findAll();
        for (Account acc : accountList) {
            System.out.println(acc);
        }
    }
}
