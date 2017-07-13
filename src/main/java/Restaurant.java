import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurant {

    HotDrink hotDrink;

    public Restaurant(HotDrink hotDrink) {

        this.hotDrink = hotDrink;
    }

    public Restaurant() {
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}


class Main {

    public static void main(String[] args) {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
        Restaurant restaurant;

        restaurant = ctx.getBean("teaRestaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotDrink();

        //restaurant=ctx.getBean("expressTeaRestaurant",Restaurant.class);
        //restaurant.hotDrink.prepareHotDrink();
        }
}