package config.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 10:52
 * <p>
 * TODO BeanPostProcessor(bean的前处理和后处理)
 * - 作用：定义了所有bean初始化前后进行的统一动作，用于对bean进行创建前业务处理与创建后业务处理
 * - 运行时机：当前操作伴随着每个bean的创建过程，每次创建bean均运行该操作
 */
public class MyBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean[" + beanName + "]之前进行操作");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean[" + beanName + "]之后进行操作");
        return bean;
    }
}
