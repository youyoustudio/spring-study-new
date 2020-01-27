package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 1.编写后置处理器的实现类
 * 2.将后置处理器配置在配置文件中作为组件
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("["+beanName+"]调用postProcessBeforeInitialization方法"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("["+beanName+"]调用postProcessAfterInitialization"+bean);
        return bean;
    }
}
