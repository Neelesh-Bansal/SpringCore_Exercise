package ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config7.xml");
        Restaurent restaurent = applicationContext.getBean( Restaurent.class);
        restaurent.getHotDrink().prepareHotDrink();

    }
}
