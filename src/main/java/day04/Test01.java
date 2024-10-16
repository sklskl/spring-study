package day04;

import org.junit.Test;

/**
 * @program: spring_study
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-09-01 21:40
 * @description:其他api的学习
 */
public class Test01 {
    /*数组
    * 存储数据的优缺点
    * 优点：存储数据可以重复
    * 缺点：存储数据长度不可变，代码逻辑需要自己组织
    * 特点：初始化后长度确定，多个元素依次紧密排列
    *
    * */
    @Test
    public void test01(){
        String propertory = System.getProperty("java.version");
        System.out.println(propertory);
    }
}
