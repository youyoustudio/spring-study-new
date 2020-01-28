package com.youyoustudio;

import com.youyoustudio.dao.BookDao;
import com.youyoustudio.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    /**
     * 通过注解将组件批量加入到ioc容器
     */
    @Test
    public void testCommentSacn() {
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        BookDao bookDao1 = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao == bookDao1);
    }
}
