package com.quadtalent.sofaark.myjarplugin;

import com.quadtalent.sofaark.myjar.MyDemo;

/**
 * @author wanglei
 * @since 2021/10/8 2:33 下午
 */
public class SsoPluginService {

    public void show(){
        MyDemo myDemo = new MyDemo();
        System.out.println("SsoPluginService classloader = " + this.getClass().getClassLoader());
        System.out.println();
        myDemo.test1();
    }

}
