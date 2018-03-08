package ex5;

import org.springframework.beans.factory.annotation.Required;

public class Restaurent {
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
