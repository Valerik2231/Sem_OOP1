import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal {


    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    protected void wakeup() {
        System.out.println("Snake wakes up");
    }
    @Override
    protected void eat() {
        System.out.println("Snake ate");
    }
    @Override
    protected void play() {
        System.out.println("Snake playing");
    }
    @Override
    protected void sleep() {
        System.out.println("Snake sleeping");
    }
    @Override
    protected void go() {
        System.out.println("snake is crawling");
    }
    @Override
    protected void fly() {
        System.out.println("Snake can't fly");
    }
    @Override
    protected void swim() {
        System.out.println("Snake can't swimming");
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
}
