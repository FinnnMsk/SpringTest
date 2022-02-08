package spring_course;

import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements Transport{
    @Override
    public void movingPlace() {
        System.out.println("Едет");
    }

    public Bus() {
        System.out.println("Создали Автобус");
    }
}
