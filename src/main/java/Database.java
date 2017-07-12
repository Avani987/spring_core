import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Database {

    int port;
    String Name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Port : "+ port + ", Name: "+ Name;
    }

    public static void main(String[] args) {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
        Database db = ctx.getBean("database",Database.class);
        System.out.println(db);

    }


}

