import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {

    List list;
    Set set;
    Map map;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    void display()
    {
        System.out.println("List values : " +list);
        System.out.println("Set values : "+set);
        System.out.println("Map values : "+map);
    }

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("complexBeans.xml");
        Complex complex;

        complex=ctx.getBean("complexBean",Complex.class);
        complex.display();
    }
}
