
import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flyable, Goable, Swimable{

    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void lifeCycle() {
        wakeup();
        eat();
        play();
        sleep();
        wakeup();
        go();
        fly();
        eat();
        swim();
        sleep();
    }

    @Override
    public double Flyable() {
        return 10;
    }

    @Override
    public double Go() {
        return 3;
    }

    @Override
    public double Swim() {
        return 5;
    }
}