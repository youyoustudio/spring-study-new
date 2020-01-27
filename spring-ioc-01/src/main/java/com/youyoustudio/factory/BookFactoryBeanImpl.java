package com.youyoustudio.factory;

import com.youyoustudio.bean.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * 实现FactoryBean接口的类是Spring可以认识的工厂类，Spring会自动调用工厂方法创建实例
 * 使用方法：
 * 1. 编写一个FactoryBean的实现类
 * 2. 在spring配置文件中进行注册
 */
public class BookFactoryBeanImpl implements FactoryBean<Book> {


    /**
     * 返回对象
     * @return
     * @throws Exception
     */
    public Book getObject() throws Exception {
        System.out.println("使用BookFactoryBeanImpl创建Book实例");
        Book book = new Book();
        book.setBookName("测试Book");
        book.setAuthor("lbxx");
        return book;
    }

    /**
     * 返回对象类型
     * Spring会自动调用这个方法来确认创建的对象是什么类型
     * @return
     */
    public Class<?> getObjectType() {
        return Book.class;
    }

    /**
     * 是单例？
     * true为单例
     * false为非单例
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
