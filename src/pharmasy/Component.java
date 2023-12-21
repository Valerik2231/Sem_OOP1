package pharmasy;

public class Component  implements Comparable{
    private String name;
    private String weight;
    private int power;


    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;

    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Component) {
            if (this.power > ((Component)o).power) return 1;
            if (this.power < ((Component)o).power) return -1;
            return 0;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Component){
            var temp = (Component) obj;
            return name.equals(temp.name) && weight.equals(temp.weight) && power == temp.power;
        }
        return super.equals(obj);
    }
    @Override
    public int hashCode(){
        return name.hashCode() + power + weight.hashCode();
    }
}
