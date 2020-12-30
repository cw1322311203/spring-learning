package config.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ResourceBundle;

/**
 * @author 陈小哥cw
 * @date 2020/12/30 10:04
 *
 * - bean只有通过配置才可以进入spring容器，被spring加载并控制
 * - 配置bean的方式如下：
 *   - XML文件中使用<bean/>标签配置
 *   - 使用@Component及衍生注解配置
 * - 企业开发过程中，通常需要配置大量的bean，需要一种快速高效配置大量bean的方式,这就可以使用自定义bean导入器
 */
// TODO 自定义bean导入器
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        ResourceBundle bundle = ResourceBundle.getBundle("import");
        String[] className = bundle.getString("className").split(",");
        return className;
    }
}
