package singletonTest;

/**
 * @program: spring_study
 * @ClassName: singletonTest01
 * @author: skl
 * @create: 2024-10-31 16:02
 */
/*饿汉式
 * 单例设计模式
 * 所谓的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某一个类只能存在一个对象的实例
 * */
public class singletonTest01 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1==bank2);
        System.out.println(bank1.hashCode()+" "+bank2.hashCode());
        System.out.println(bank1.equals(bank2));
    }

}

//如何实现一个单例类
class Bank {
    //私有化类的构造器
    private Bank() {

    }

    private static Bank instance = new Bank();
    public static Bank getInstance() {
        return instance;
    }

}