import java.util.*;

public class VeterinaryClinic {
    private List<Staff> staffs = new ArrayList<>();
    private List<Animal> patients = new ArrayList<>();

    public void Add(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal item:patients) {
            if (item instanceof Goable) result.add((Goable) item);
        }
        return result;
    }
    public List<Flyable> getFlyebla(){
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal item:patients) {
            if (item instanceof Flyable) result.add((Flyable) item);
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal item:patients) {
            if (item instanceof Swimable) result.add((Swimable) item);
        }
        return result;
    }
}