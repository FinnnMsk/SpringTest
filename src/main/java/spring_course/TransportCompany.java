package spring_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("transportCompany")
public class TransportCompany {
    private Transport transport;
    @Value("PetrovNY")
    private String manager;

    @Autowired
    public TransportCompany(@Qualifier("ship") Transport transport) {
        System.out.println("Создали компанию");
        this.transport = transport;
    }

    public void typeTransport(){
        System.out.println("Как перемещается транспорт?");
        transport.movingPlace();
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
