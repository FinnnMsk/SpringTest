package spring_course;

public class Ship implements Transport{
    @Override
    public void movingPlace() {
        System.out.println("Перемещается по воде");
    }
}
