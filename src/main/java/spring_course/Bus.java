package spring_course;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bus")
public class Bus implements Transport{
    @Override
    public void movingPlace() {
        System.out.println("Едет");
    }

    public Bus() {
        System.out.println("Создали Автобус");
    }

    @PostConstruct
    public void init(){
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }
}
