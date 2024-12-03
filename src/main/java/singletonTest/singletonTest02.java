package singletonTest;

/**
 * @program: spring_study
 * @ClassName: singletonTest02
 * @author: skl
 * @create: 2024-10-31 16:28
 */
/*
* 懒汉式：线程不安全
*
*什么叫线程安全，
*
* */
public class singletonTest02 {
    public static void main(String[] args) {
        Order instance1 = Order.getInstance();
        Order instance2 = Order.getInstance();
        System.out.println(instance1==instance2);
    }
}
class  Order{
    //1、私有化类的构造器
    private Order(){

    }
    //2声明当前类对象，没有初始化
    private static Order instance=null;
    public static Order getInstance(){
        if (instance==null) {
            instance = new Order();
        }
        return instance;
    }
}
