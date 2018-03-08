package ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config5.xml");
        Restaurent restaurent = applicationContext.getBean( Restaurent.class);
        restaurent.getHotDrink().prepareHotDrink();

    }
}
