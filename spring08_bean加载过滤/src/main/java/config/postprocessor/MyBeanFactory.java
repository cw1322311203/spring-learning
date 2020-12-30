package config.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 10:46
 * <p>
 * TODO BeanFactoryPostProcessor(工厂的后处理)
 * - 作用：定义了在bean工厂对象创建后，bean对象创建前执行的动作，用于对工厂进行创建后业务处理
 * - 运行时机：当前操作用于对工厂进行处理，仅运行一次
 */
public class MyBeanFactory implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("bean工厂制作完成...");
    }
}
