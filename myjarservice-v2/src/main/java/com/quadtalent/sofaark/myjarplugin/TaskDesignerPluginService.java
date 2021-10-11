package com.quadtalent.sofaark.myjarplugin;

import com.quadtalent.sofaark.myjar.MyDemo;

/**
 * @author wanglei
 * @since 2021/10/8 2:35 下午
 */
public class TaskDesignerPluginService {

    public void show(){
        MyDemo myDemo = new MyDemo();
        System.out.println("TaskDesignerPluginService classloader = " + this.getClass().getClassLoader());
        System.out.println();
        myDemo.test2();
    }

}
