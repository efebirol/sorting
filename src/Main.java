import java.util.*;


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

        //1. Möglichkeit zu soriteren: via Collections
        //Collections.sort(numbers);

        //2.1 Möglichkeit: Einfaches Sortieren über eigene Bubble Sort Methode (einfach Integer)
        Sorter mysorter = new Sorter();
        System.out.println("Einfaches Sortieren - Vor dem sortieren:");
        mysorter.printSortArray(numbers);

        mysorter.sortBlock(numbers);

        System.out.println("\nEinfaches Sortieren - Nach dem sortieren:");
        mysorter.printSortArray(numbers);

        //2.2 Möglichkeit: Sortieren über eigene Bubble Sort Methode, hier über ein Objekt mit "Set"-Liste/Array, die Integer enhählt
        //befüllte ArtikelBlock mit Randomzahlen

        //erstelle Set-Liste mit Integer-Werten
        Set<ArticleBlock> blocks = new HashSet<ArticleBlock>();

        for (int i = 0; i <= 10; i++) {
            blocks.add(new ArticleBlock());
        }

        //konvertiere Set in List (Info: erlaubt get, sortiert und erlaubt Duplikate)
        List<ArticleBlock> listBlocks = new ArrayList<>(blocks);
        for (int i = 0; i <=10 ; i++) {
            listBlocks.get(i).setSortIndex((int)(Math.random()*100));
        }

        SorterOfSet mysetsorter = new SorterOfSet();
        System.out.println("\nSet mit Objekt Sortieren - Vor dem sortieren:");
        mysetsorter.printSortArray(listBlocks);
        mysetsorter.sortBlock(listBlocks);
        System.out.println("\nSet mit Objekt Sortieren - Nach dem sortieren:");
        mysetsorter.printSortArray(listBlocks);


    }


}
