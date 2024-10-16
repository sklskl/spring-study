package day03;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @program: spring_study
 * @ClassName: Compare01
 * @author: skl
 * @create: 2024-08-14 21:37
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
}
