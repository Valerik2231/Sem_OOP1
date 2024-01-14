package pharmasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Comparable<Component> {
    private int index;
    private final List<Component> components;

    public Pharmacy() {
        index = 0;
        this.components = new ArrayList<>();

    }
    public void addComponents(Component ... args){
        Collections.addAll(components, args);
    }

    public List<Component> getComponents(){
        return components;
    }

    @Override
    public int hashCode(){
        int code = 0;
        for (int i = 0; i < components.size(); i++) {
            code += components.get(i).hashCode()/5;
        }
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == ((Pharmacy)obj).hashCode();
    }

    @Override
    public int compareTo(Component o) {
        return 0;
    }
}
