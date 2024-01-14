import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Cat cat = new Cat("Barsik", LocalDate.of(1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        Eagle eagle = new Eagle("Orlusha", LocalDate.of(1999,3,6),
                new ArrayList<>(), "Polyomavirus", "Dagget");
        Snake snake = new Snake("System32", LocalDate.of(2000,6,23),
                new ArrayList<>(), "Chumka", "Norbert");
        Duck duck = new Duck("Adolf", LocalDate.of(2016,5,12),
                new ArrayList<>(), "Polyomavirus", "Boss");
        Fish fish = new Fish("Pepe", LocalDate.of(2022,3,6),new ArrayList<>(),"Fill", "Me");
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(cat, eagle,eagle,duck,fish);

        Doctor doctor = new Doctor("Ivan", 30);
        clinic.AddDoctor(doctor);
        Nurse nurse = new Nurse("Nina", 20);
        clinic.AddNurse(nurse);
        nurse.Vaccinating(duck, "AntiGrip");
        doctor.Inspection(duck);




    }
}