package org.example.class02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 手动实现ioc容器
 * 1.实例化bean
 * 2.保存bean
 * 3.提供bean
 */
public class IoCContainer {
    private Map<String,Object> beans = new ConcurrentHashMap<String,Object>();

    /**
     * 通过ioc容器获取bean
     * @param beanId
     * @return bean 实例
     */
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    /**
     * 委托ioc容器创建一个bean
     * @param clazz 要创建的bean的class
     * @param beanId beanId
     * @param paramBeanIds 要创建bean的class的构造方法所需要的参数的beanId们
     */
    public void setBeans(Class<?> clazz, String beanId,String... paramBeanIds){
        // 1.组装构造方法所需要的参数值
        Object [] paramValues = new Object[paramBeanIds.length];
        for(int i = 0;i < paramBeanIds.length; i++){
            paramValues[i] = beans.get(paramBeanIds[i]);
        }
        // 2.调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor: clazz.getConstructors()){
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        if(bean == null) {
            throw new RuntimeException("找不到合适的构造方法去实例化bean");
        }
        // 3.将实例化的bean放到beans
        beans.put(beanId,bean);
    }
}
