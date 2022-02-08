import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_course.Airplane;
import spring_course.SpringConfig;
import spring_course.Transport;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Transport transport = context.getBean("airplane", Airplane.class);
        transport.movingPlace();

        context.close();
    }
}
