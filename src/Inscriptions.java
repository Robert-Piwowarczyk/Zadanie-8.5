import java.util.Objects;
import java.util.Scanner;

public class Inscriptions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("wpisz ciąg liter: ");
        String word1 = input.next();
        System.out.println("wpisz ciąg liter: ");
        String word2 = input.next();
    }
    String word1;
    String word2;

    public String equals(Object o) {
        if (this == o) return word1;
        if (o == word2) return word2;
        word1 = (word2) o;
        return "koniec";
        Objects.equals(word1, word2);
    }
}