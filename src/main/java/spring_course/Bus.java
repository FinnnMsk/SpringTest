package spring_course;

public class Bus implements Transport{
    @Override
    public void movingPlace() {
        System.out.println("Перемещается по земле");
    }
}
