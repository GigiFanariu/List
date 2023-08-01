import java.util.Arrays;
import java.util.List;

public class Exercise_list {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Roma", "Milano", "Catania");
        //cityNames.add("Bologna"); //UnsupportedOperationException: The cityNames list is immutable.
        cityNames.set(1, "Catanzaro");

        System.out.println(cityNames);

        List<String> kingsOfRome =Arrays.asList(
        "Romolo",
        "Numa Pompilio",
        "Tullio Ostilio",
        "Anco Marzio",
        "Tarquinio Prisco",
        "Servio Tullio",
        "Tarquinio il Superbo"
        );
        System.out.println(kingsOfRome);
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Tarquinio il Superbo";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
