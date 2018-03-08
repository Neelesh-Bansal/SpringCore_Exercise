package ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application6 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config6.xml");
        Restaurent restaurent = applicationContext.getBean( Restaurent.class);
        restaurent.getHotDrink().prepareHotDrink();

    }
}
