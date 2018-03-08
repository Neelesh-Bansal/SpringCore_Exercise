package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config2.xml");
        Restaurent restaurent = applicationContext.getBean("restaurant3",Restaurent.class);
        restaurent.getHotDrink().prepareHotDrink();

    }
}
