package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public class InheritanceProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animals animals1 = new Animals(5, 50);
        Dog animals2 = new Dog(3, 5, 50);
        System.out.println(animals1);
        System.out.println(animals2);
        System.out.println("Parent equals child: " + animals1.equals(animals2));
        System.out.println("Parent equals child: " + animals2.equals(animals1));
        System.out.println("Animal1 height = " + animals1.getheight());
        System.out.println("Animal2 height = " + animals2.getheight());
        System.out.println("Animal1 weight = " + animals1.getweight());
        System.out.println("Animal2 weight = " + animals2.getweight());
        System.out.println("Animal2 weight 10 kg more = " + animals2.getDogWeight());
    }

}
