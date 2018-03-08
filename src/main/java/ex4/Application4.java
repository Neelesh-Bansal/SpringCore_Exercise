package ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config4.xml");
        Restaurent restaurent = applicationContext.getBean( Restaurent.class);
        restaurent.getHotDrink().prepareHotDrink();
        System.out.println(applicationContext.isPrototype("restaurent"));

    }
}
