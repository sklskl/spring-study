package day01;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.Servlet;

/**
 * @program: spring_study
 * @ClassName: User
 * @author: skl
 * @create: 2024-08-06 21:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userName;
    private Integer num;
    private String pwd;
    public void sayHello(){
        DruidDataSource druidDataSource = new DruidDataSource();
        Servlet servlet = null;

    }

}
