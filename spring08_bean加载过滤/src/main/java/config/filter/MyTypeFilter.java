package config.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author 陈小哥cw
 * @date 2020/12/29 16:48
 * <p>
 * todo 自定义类型过滤器
 */
public class MyTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 加载的类满足要求，匹配成功
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        String className = classMetadata.getClassName();
        System.out.println(className);
        // 如
        if (className.equals("com.cw.service.impl.UserServiceImpl")) {
            return true;
        }
        return false;
    }
}
