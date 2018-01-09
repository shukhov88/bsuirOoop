package IPR_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shukhovvg on 26.12.2017.
 */
public class Runner {

    static int weight() {
        return (int) (Math.random() * 49);
    }
    static int age() {
        return (int) (Math.random() * 9);
    }

    public static void main(String args[]) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            Cat cat = new Cat("Cat" + i);
            cat.countFood(weight(), age());
            animals.add(cat);
        }
        for (int i = 1; i < 6; i++) {
            Dog dog = new Dog("Dog" + i);
            dog.countFood(weight(), age());
            animals.add(dog);
        }
        SearchInfo.searchGuttler(animals);
    }
}
