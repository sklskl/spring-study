package day01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: spring_study
 * @ClassName: DemoServlet
 * @author: skl
 * @create: 2024-08-09 10:29
 */
@WebServlet(name = "DemoServlet",urlPatterns = "/skl/demo01")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo01");
    }
}
