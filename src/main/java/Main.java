import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_course.Bus;
import spring_course.SpringConfig;
import spring_course.TransportCompany;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Bus bus = context.getBean("bus", Bus.class);
        bus.movingPlace();

        context.close();
    }
}
