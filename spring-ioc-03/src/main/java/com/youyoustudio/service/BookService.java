package com.youyoustudio.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("myBookService") //可以修改默认bean的名称
@Scope(value = "prototype")//通过该注解，可以设置为多实例
public class BookService {
}
