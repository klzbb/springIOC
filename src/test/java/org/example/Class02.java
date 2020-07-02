package org.example;

import static org.junit.Assert.assertTrue;

import org.example.class02.IoCContainer;
import org.example.class02.car.Audi;
import org.example.class02.car.Buick;
import org.example.class02.humen.Humen;
import org.example.class02.humen.Lisi;
import org.example.class02.humen.ZhanSan;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Class02
{

    private IoCContainer ioCContainer = new IoCContainer();
    @Before
    public void before(){
        ioCContainer.setBeans(Audi.class,"audi");
        ioCContainer.setBeans(Buick.class,"buick");
        ioCContainer.setBeans(ZhanSan.class,"zhansan","audi");
        ioCContainer.setBeans(Lisi.class,"lisi","buick");
    }

    @Test
    public  void test(){
        Humen zhansan = (Humen) ioCContainer.getBean("zhansan");
        zhansan.goHome();

        Humen lisi = (Humen) ioCContainer.getBean("lisi");
        lisi.goHome();
    }
}
