package com.quadtalent.sofaark.myjarplugin;

import com.quadtalent.sofaark.myjar.MyDemo;

/**
 * @author wanglei
 * @since 2021/10/8 2:35 下午
 */
public class MyJarService2 {

    public void show(){
        MyDemo myDemo = new MyDemo();
        System.out.println("MyJar1Service classloader = " + this.getClass().getClassLoader());
        myDemo.test2();
    }

}
