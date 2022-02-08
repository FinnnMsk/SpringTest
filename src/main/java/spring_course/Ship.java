package spring_course;

import org.springframework.stereotype.Component;

@Component("ship")
public class Ship implements Transport{
    @Override
    public void movingPlace() {
        System.out.println("Плывёт");
    }

    public Ship() {
        System.out.println("Создали Корабль");
    }
}
