import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class counter = new Class();
        List < Integer > angka = new ArrayList < > ();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 20 angka:");
        for (int i = 0; i < 20; i++) {
            angka.add(scanner.nextInt());
        }

        counter.setNumbers(angka);
        counter.countDuplicates();
        counter.displayDuplicateCount();
    }
}