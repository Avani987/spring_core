import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component //other listed annotations can also be used in similar way in place of this one
//@Controller
//@Service
//@Component
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

   @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}

@Component
class Main {

    public static void main(String[] args) {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
        Restaurant restaurant;

        restaurant = ctx.getBean("teaRestaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotDrink();

        }
}