package day01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
