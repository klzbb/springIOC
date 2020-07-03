package org.example;

import org.example.class03.Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class03 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);

        Bean bean2 = (Bean) context.getBean("bean");

        System.out.println("bean=" + bean);
        bean.getMessage();

        System.out.println("bean2=" + bean);
        System.out.println(bean == bean2);
        bean2.getMessage();

        bean.testDogRun();
    }
}
