package com.quadtalent.sofaark.myjarplugin;

import com.quadtalent.sofaark.myjar.MyDemo;

/**
 * @author wanglei
 * @since 2021/10/8 3:03 下午
 */
public class MyJarService3 {

    public void show(){
        MyDemo myDemo = new MyDemo();
        System.out.println("MyJar3Service classloader = " + this.getClass().getClassLoader());
        myDemo.test1();
    }

}
