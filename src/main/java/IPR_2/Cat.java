package IPR_2;

/**
 * Created by shukhovvg on 26.12.2017.
 */
public class Cat implements Animal {

    private String name;
    private int food;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void countFood(int weight, int age) {

        if (age <= 1) {
            food = weight * 10;
        } else {
            food = weight * 54;
        }
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("Cat's name: " + name);
        System.out.println(name + "'s feed per day: " + food);
    }

    @Override
    public int getFood() {
        return food;
    }
}
