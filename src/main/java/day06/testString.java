package day06;

/**
 * @program: spring_study
 * @ClassName: testString
 * @author: skl
 * @create: 2024-10-16 11:17
 */
public class testString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(str.hashCode()+" "+sb.hashCode());
        String s = "hello";
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(s.hashCode()+" "+sb2.hashCode());
    }
}
