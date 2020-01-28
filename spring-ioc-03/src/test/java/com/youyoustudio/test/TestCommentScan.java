package com.youyoustudio.test;

import com.youyoustudio.dao.BookDao;
import com.youyoustudio.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCommentScan {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    /**
     * 通过注解将组件批量加入到ioc容器
     */
    @org.junit.Test
    public void testCommentSacn() {
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        BookDao bookDao1 = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao == bookDao1);
    }

    /**
     * 作用域及名称
     */
    @Test
    public void testScope() {
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);//默认为类名首字母小写
        System.out.println(bookDao);
        BookService myBookService01 = applicationContext.getBean("myBookService", BookService.class);//默认名称可以修改
        BookService myBookService02 = applicationContext.getBean("myBookService", BookService.class);
        System.out.println(myBookService01 == myBookService02);//通过@Scope注解可以改变单例和非单例
    }
}
