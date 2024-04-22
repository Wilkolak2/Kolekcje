import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> Imiona = new HashSet<String>();
        while (true) {
            System.out.println("Podaj imie: ");
            String imie = scanner.nextLine();
            if(imie.equals("-")){
                break;
            }
            Imiona.add(imie);
        }
        System.out.println(Imiona.size());
    }
}
