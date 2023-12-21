public class Doctor extends Staff{
    public Doctor(String name, int age) {
        super(name, age);
    }

    public void Inspection(Animal animal){
        var animalType = animal.type;
        var ilness = animal.illness;

        System.out.printf("Осмотр животного... Это %s, и он болен %s",animalType,ilness);
    }
}
