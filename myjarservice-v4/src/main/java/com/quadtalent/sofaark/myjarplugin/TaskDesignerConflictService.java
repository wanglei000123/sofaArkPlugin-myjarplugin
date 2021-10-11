package com.quadtalent.sofaark.myjarplugin;

import com.quadtalent.sofaark.myjar.MyDemo;

/**
 * @author wanglei
 * @since 2021/10/8 3:03 下午
 */
public class TaskDesignerConflictService {

    public void show(){
        MyDemo myDemo = new MyDemo();
        System.out.println("TaskDesignerConflictService classloader = " + this.getClass().getClassLoader());
        System.out.println();
        myDemo.test2();
    }

}
