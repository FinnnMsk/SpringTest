package spring_course;

import org.springframework.stereotype.Component;

@Component("airplane")
public class Airplane implements Transport{
    @Override
    public void movingPlace() {
        System.out.println("Перемещается по воздуху");
    }
}
