import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable, Goable{

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);

    }

    @Override
    public double Flyable() {
        return 20;
    }

    @Override
    public double Go() {
        return 3;
    }
}