package com.youyoustudio.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    public Person() {
        System.out.println("Person对象被创建");
    }

    public Person(String lastName, Integer age, String gender, String email) {
        System.out.println("调用有参构造方法");
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    //基本类型使用property标签进行标记
    private String lastName = "张三";
    private Integer age;
    private String gender;
    private String email;


    private Car car;

    private List<Book> bookList;

    private Map<String,Object> maps;

    private Properties properties;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("setLastName方法被调用："+lastName);
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", car=" + car +
                ", bookList=" + bookList +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
