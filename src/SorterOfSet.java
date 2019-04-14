import java.util.ArrayList;
import java.util.List;

//Sort-Methode für Objekt mit einer Set-Liste/Array, die Integer enthält, welche sortiert werden sollen
public class SorterOfSet {


    SorterOfSet() {
    }

    //Schleife um alle Arrayinhalte einmal durchzugehen.
    public List<ArticleBlock> sortBlock(List<ArticleBlock> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                //Schleife um jedes Wert mit dem Nachbar zu vergleichen
                if (numbers.get(j).getSortIndex() > numbers.get(j+1).getSortIndex()) {
                    switchNumbers(numbers, j, j + 1);
                }
            }
        }
        return numbers;
    }

    //Ausgabe des Arrays
    public void printSortArray(List<ArticleBlock> meineListe) {
        for (ArticleBlock element : meineListe) {
            System.out.print(element.getSortIndex() + " ");
        }
    }

    /*
        Dabei wird nach jedem sortieren geht die grösste Zahle (hoch gebublt) nach ganz oben,
        und es wieder von vorne angefangen, wobei immer die letzte Zahl im Array nicht mehr geprüft werden muss (index -1)
    */
    public void switchNumbers(List<ArticleBlock> numbers, int numberOneIndex, int numberTwoIndex) {
        int temp;

        temp = numbers.get(numberOneIndex).getSortIndex();
        //ToDo: setzte die Nummer im Sort Index
        numbers.get(numberOneIndex).setSortIndex(numbers.get(numberTwoIndex).getSortIndex());
        numbers.get(numberTwoIndex).setSortIndex(temp);

    }
}
