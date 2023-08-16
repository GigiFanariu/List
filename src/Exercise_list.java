import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_list {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Roma", "Milano", "Catania");
        //cityNames.add("Bologna"); //UnsupportedOperationException: The cityNames list is immutable.
        cityNames.set(1, "Catanzaro");

        System.out.println(cityNames);

        ArrayList<String> kingsOfRome = new ArrayList<String>();

        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println(kingsOfRome);
        String[] kingsOfRomeArray = new String[0];
        kingsOfRomeArray[6] = "Tarquinio il Superbo";
        kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
