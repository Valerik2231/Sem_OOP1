public class Nurse extends Staff{
    public Nurse(String name, int age) {
        super(name, age);
    }
    public void Vaccinating (Animal animal, String vaccinateName){
        animal.vaccinations.add(vaccinateName);
        System.out.printf("Вакцина %s сделана %s %s\n", vaccinateName,animal.type, animal.name);

    }
}
