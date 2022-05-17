package main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] argv) {
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);

        //UserDao userDao = ctx.getBean(UserDao.class);
        //userDao.test();
        SpringApplication.run(MyApplication.class);
    }
}