import com.cw.domain.Account;
import com.cw.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 陈小哥cw
 * @date 2020/12/28 16:40
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        /*Account ac1 = accountService.findById(1);
        System.out.println(ac1);*/

        /*Account account = new Account();
        account.setName("Tom");
        account.setMoney(123456.78);
        accountService.save(account);*/

        //accountService.delete(4);

        List<Account> accountList = accountService.findAll();
        for (Account acc : accountList) {
            System.out.println(acc);
        }
    }
}
