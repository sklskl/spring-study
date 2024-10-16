package day03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: spring_study
 * @ClassName: Product
 * @author: skl
 * @create: 2024-08-14 21:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private double price;

}
