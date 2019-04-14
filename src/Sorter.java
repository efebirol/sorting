import java.util.ArrayList;
import java.util.List;

//Einfach Sort-Methode, wo nur Zahlen durchiteriert werden
public class Sorter {


    //Schleife um alle Arrayinhalte einmal durchzugehen.
    public List<Integer> sortBlock(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                //Schleife um jedes Wert mit dem Nachbar zu vergleichen
                if (numbers.get(j) > numbers.get(j + 1)) {
                    switchNumbers(numbers, j, j + 1);
                }
            }
        }
        return numbers;
    }

    //Ausgabe des Arrays
    public void printSortArray(List<Integer> meineListe) {
        for (Integer element : meineListe) {
            System.out.print(element + " ");
        }
    }

    /*
        Dabei wird nach jedem sortieren geht die grösste Zahle (hoch gebublt) nach ganz oben,
        und es wieder von vorne angefangen, wobei immer die letzte Zahl im Array nicht mehr geprüft werden muss (index -1)
    */
    public void switchNumbers(List<Integer> numbers, int numberOneIndex, int numberTwoIndex) {
        int temp;

        temp = numbers.get(numberOneIndex);
        numbers.set(numberOneIndex, numbers.get(numberTwoIndex));
        numbers.set(numberTwoIndex, temp);

    }
}
