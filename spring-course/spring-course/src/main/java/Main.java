import io.moshe.spring.first.assignment.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring.xml"});

        Car car = (Car) context.getBean("car");

        System.out.println("car's engine is: " + car.getEngine());

        System.out.println("dashboard is: " + car.dashboard.toString());

    }

}
