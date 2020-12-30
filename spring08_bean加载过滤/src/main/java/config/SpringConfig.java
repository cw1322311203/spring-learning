package config;

import config.filter.MyTypeFilter;
import config.postprocessor.MyBean;
import config.postprocessor.MyBeanFactory;
import config.registrar.CustomeImportBeanDefinitionRegistrar;
import config.registrar.MyImportBeanDefinitionRegistrar;
import config.selector.CustomerImportSelector;
import config.selector.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 16:02
 */
@Configuration
/*
   @ComponentScan设置spring配置加载类扫描规则
   includeFilters：设置包含性过滤器
   excludeFilters：设置排除性过滤器
   type：设置过滤器类型
 */
@ComponentScan("com.cw")//需要相应类上使用@Component进行标注才能识别

// TODO 自定义bean定义注册器，可以快速加载某个包，无需写@Component进行标注
//@Import(MyImportBeanDefinitionRegistrar.class)//功能等于ComponentScan
// TODO CustomeImportBeanDefinitionRegistrar只扫描path路径com.cw.dao.impl.*下的包
/* TODO BeanFactoryPostProcessor
   - 作用：定义了在bean工厂对象创建后，bean对象创建前执行的动作，用于对工厂进行创建后业务处理
   - 运行时机：当前操作用于对工厂进行处理，仅运行一次

   TODO BeanPostProcessor
   - 作用：定义了所有bean初始化前后进行的统一动作，用于对bean进行创建前业务处理与创建后业务处理
   - 运行时机：当前操作伴随着每个bean的创建过程，每次创建bean均运行该操作
*/
@Import({CustomeImportBeanDefinitionRegistrar.class, MyBeanFactory.class, MyBean.class})


// TODO 自定义bean导入器，这是一种快速高效配置大量bean的方式
//@Import(MyImportSelector.class)
//@Import(CustomerImportSelector.class)


// TODO 自定义组件过滤器
// 按照注解方式进行过滤
//@ComponentScan(
//        value = "com.cw",//设置基础扫描路径
//        excludeFilters = //设置过滤规则，当前为排除过滤
//        @ComponentScan.Filter(//设置过滤器
//                type = FilterType.ANNOTATION,//设置过滤方式为按照注解进行过滤
//                classes = Service.class//设置具体的过滤项，过滤所有@Service修饰的bean
//        )
//)
//按照自定义过滤器进行过滤
//@ComponentScan(
//        value = "com.cw",//设置基础扫描路径
//        excludeFilters = //设置过滤规则，当前为排除过滤
//        @ComponentScan.Filter(//设置过滤器
//                type = FilterType.CUSTOM,//设置过滤方式为按照自定义过滤器进行过滤
//                classes = MyTypeFilter.class//设置具体的过滤项，根据自定义过滤器的规则来进行过滤
//        )
//)

public class SpringConfig {
}
