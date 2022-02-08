import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_course.SpringConfig;
import spring_course.TransportCompany;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        TransportCompany transportCompany = context.getBean("transportCompany", TransportCompany.class);
        transportCompany.typeTransport();

        context.close();
    }
}
