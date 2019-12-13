package com.pan.classloader;

/**
 * @description
 * @author loren
 * @Date 2019/12/13
 * @version v1.0
 */

/**
 *
 * javap -c 查看字节码
 * <p>对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * 当一个类在初始化时，要求父类全部都已经初始化完毕</p>
 * <P>-XX:+TraceClassLoading，用于追踪类的加载信息并打印出来</p>
 * <h2>jvm参数设置</h2>
 * <P> -XX:+<option>，表示开启option选项</p>
 * <P>-XX:-<option>，表示关闭option选项</p>
 * <P>-XX:<option>=value，表示将option的值设置为value</p>
 */
public class ClassLoadTest01 {

    public static void main(String[] args) {

        System.out.println(child1.a);
    }

}

class parent1{

    public  static    int a = 1;
    static {
        System.out.println("parent");
    }

}

class  child1 extends parent1{

    public  static   int b = 1;

    static {
        System.out.println("child");
    }

}
