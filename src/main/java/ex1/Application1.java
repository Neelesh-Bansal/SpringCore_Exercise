package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Database database = applicationContext.getBean("database1",Database.class);
        System.out.println(database.getName());
        System.out.println(database.getPort());

    }
}
