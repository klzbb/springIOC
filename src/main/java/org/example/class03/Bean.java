package org.example.class03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bean {
    private String message;
    private Integer age;
    private Dog dog;

    // 使用注解注入
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void testDogRun(){
        dog.run();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Bean() {
        System.out.println("Bean.Bean");
    }
}
