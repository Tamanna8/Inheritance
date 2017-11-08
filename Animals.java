package sharmat;

/**
 *
 * @author Tamanna sharma
 */
public class Animals {

    int height;
    int weight;

    public Animals(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getheight() {
        return height;
    }

    public int getweight() {

        return weight;
    }

    @Override
    public String toString() {
        return "Animals{" + "hight=" + height + ", weight=" + weight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.height;
        hash = 71 * hash + this.weight;
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
        if (!(obj instanceof Animals)) {
            return false;
        }
        final Animals other = (Animals) obj;
        if (this.height != other.height) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        return true;
    }

}
