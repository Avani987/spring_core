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

        System.out.println("\n After fetching teaRestaurant bean for the first time : ");
        restaurant.hotDrink.prepareHotDrink();

        Restaurant expressTea=ctx.getBean("expressTeaRestaurant",Restaurant.class);
        restaurant.setHotDrink(expressTea.getHotDrink());
        System.out.println("\n After setting the hotDrink type from Tea to ExpressTea");
        restaurant.hotDrink.prepareHotDrink();

        restaurant= ctx.getBean("teaRestaurant",Restaurant.class);

        System.out.println("\n After fetching the teaRestaurant bean again : ");
        restaurant.hotDrink.prepareHotDrink();
        }
}