package pharmasy;

import java.util.HashSet;
import java.util.Iterator;

public class PharmacyMain {
    public  static void main(String[] args){
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "1gr", 1);
        Component sugar = new Component("Sugar", "10gr", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pineceline,sugar);



        Component pineceline2 = new Component("Pineceline", "10mg", 100);
        Component salt2 = new Component("Salt", "1gr", 1);
        Component sugar2 = new Component("Sugar", "10gr", 80);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(salt2, pineceline2,sugar2);

        Component NaCl = new Component("NaCl", "1gr", 20);
        Component Water = new Component("Water", "1ml", 1000);

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponents(NaCl, Water, salt2, sugar);


        System.out.println(salt.equals(salt2));
        System.out.println(pharmacy2.equals(pharmacy1));
        System.out.println(pharmacy2.equals(pharmacy3));

        var hash = new HashSet<Pharmacy>();
        hash.add(pharmacy3);
        hash.add(pharmacy1);
        hash.add(pharmacy2);
        System.out.println(hash);
    }
}
