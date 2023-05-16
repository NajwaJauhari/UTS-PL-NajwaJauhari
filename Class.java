import java.util.*;

public class Class {
    private List < Integer > banyakAngka;
    private Map < Integer, Integer > jumlahDuplikat;

    public Class() {
        banyakAngka = new ArrayList < > ();
        jumlahDuplikat = new HashMap < > ();
    }

    public void setNumbers(List < Integer > banyakAngka) {
        this.banyakAngka = banyakAngka;
    }

    public void countDuplicates() {
        for (int Angka: banyakAngka) {
            if (!jumlahDuplikat.containsKey(Angka)) {
                int Jumlah = Collections.frequency(banyakAngka, Angka);
                if (Jumlah > 1) {
                    jumlahDuplikat.put(Angka, Jumlah);
                }
            }
        }
    }

    public void displayDuplicateCount() {
        System.out.println("daftar angka yang sama beserta jumlahnya");

        for (Map.Entry < Integer, Integer > entry: jumlahDuplikat.entrySet()) {
            int number = entry.getKey();
            int Jumlah = entry.getValue();
            System.out.println(number + " ada " + Jumlah);
        }
    }
}