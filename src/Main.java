import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/* Info: Simple BubbleSort Methode
    Gegeben ist eine 2 dimensionales Array.
    1. Schleife um alle Arrayinhalte einmal durchzugehen.
    2. Schleife um jedes Wert mit dem Nachbar zu vergleichen. Dabei wird nach jedem sortieren geht die grösste Zahle (hoch gebublt) nach ganz oben,
    und es wieder von vorne angefangen, wobei immer die letzte Zahl im Array nicht mehr geprüft werden muss (index -1)
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(19);
        numbers.add(4);
        numbers.add(21);
        numbers.add(8);
        numbers.add(12);
        numbers.add(23);
        numbers.add(43);
        numbers.add(2);
        numbers.add(6);
        numbers.add(9);


        Sorter mysorter = new Sorter();

        //1. Möglichkeit zu soriteren: via Collections
        // Collections.sort(numbers);
        System.out.println("Vor dem sortieren:");
        mysorter.printSortArray(numbers);

        mysorter.sortBlock(numbers);

        System.out.println("\nNach dem sortieren:");
        mysorter.printSortArray(numbers);


    }


}
