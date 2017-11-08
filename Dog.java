package sharmat;

import java.util.Objects;

/**
 *
 * @author Tamanna sharma
 */
public class Dog extends Animals {

    int age;

    public Dog(int age, int height, int weight) {
        super(height, weight);
        this.age = age;
    }

    @Override
    public int getweight() {
        return weight;
    }

    public int getDogWeight() {
        int weight = super.getweight();
        return weight + 10;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.age);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

}
