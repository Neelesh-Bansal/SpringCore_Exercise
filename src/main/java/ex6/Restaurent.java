package ex6;


import org.springframework.beans.factory.annotation.Autowired;

public class Restaurent {
    //@Autowired
    HotDrink hotDrink;



    @Autowired
    public Restaurent(HotDrink hot){
        hotDrink = hot;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//    @Autowired
//    public void setHotDrink(HotDrink hotDrink) {
//        this.hotDrink = hotDrink;
//    }
}
