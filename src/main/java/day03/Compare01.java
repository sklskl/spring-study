package day03;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: spring_study
 * @ClassName: Compare01
 * @author: skl
 * @create: 2024-08-14 21:42
 */
public class Compare01 {
    @Test
    public void test(){
        String [] arr = new String[]{"tom","jerry","tony","rose","lucy"};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    public  void test1(){
       Product[] arr = new Product[5];
       arr[0] = new Product("apple",10);
       arr[1] = new Product("banana",20);
       arr[2] = new Product("orange",30);
    }
}
