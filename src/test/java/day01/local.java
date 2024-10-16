package day01;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @program: spring_study
 * @ClassName: local
 * @author: skl
 * @create: 2024-08-13 22:17
 */
public class local {
    //localdate localtime localdatetime
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate"+localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime"+localDateTime);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime"+localTime);
    }
    @Test
    public void test(){
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate"+localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime"+localDateTime);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime"+localTime);
    }
}
