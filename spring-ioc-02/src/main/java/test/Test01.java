package test;

import bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    //ApplicationContext接口无close方法，无法手动调用销毁方法，需要使用ConfigurableApplicationContext接口
    ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    /**
     * 单例生命周期
     */
    @Test
    public void testLifeCycleSingleton(){
        System.out.println("容器初始化完成！");
        applicationContext.close();
    }

    /**
     * 多实例生命周期
     */
    @Test
    public void testLifeCyclePrototype(){
        System.out.println("容器初始化完成！");
        Book book02 = applicationContext.getBean("book02", Book.class);
        System.out.println(book02);
        applicationContext.close();
    }
}
