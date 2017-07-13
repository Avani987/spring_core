import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//uncomment to check autowiring for other 2 cases
public class Restaurant {

    //@Autowired  //To autowire by field
    HotDrink hotDrink;
   //@Autowired    //To autowire using constructor
    public Restaurant(HotDrink hotDrink) {

        this.hotDrink = hotDrink;
    }

    public Restaurant() {
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
   @Required
   @Autowired    //To autowire using setter method
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

        }
}