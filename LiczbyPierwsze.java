import java.util.ArrayList;

// Klasa liczb pierwszych
public class LiczbyPierwsze {

    // Deklaracja listy liczb pierwszych
    private ArrayList<Integer> liczbyPierwsze;

    // Konstruktor tworzy listę liczb pierwszych od 2 do n
    LiczbyPierwsze(int n) {
        liczbyPierwsze = new ArrayList<>(); // Utworzenie nowej listy

        for (int i = 2; i <= n; i++) {
            if (czyPierwsza(i)) { // wywołujemy metodę z parametrem ( i---> num ), zatem jeśli metoda zwraca true(jest pierwsza), to
                liczbyPierwsze.add(i); // dodajemy daną liczbę do listy liczb pierwszych
            }
        }
    }

    // Metoda zwracająca wartość m-tej liczby pierwszej
    public int liczba(int m) {
        if (m < liczbyPierwsze.size() && m >= 0) { // jeśli m jest mniejsze od ilości liczb pierwszych oraz > 0, to
            return liczbyPierwsze.get(m); // zwracamy wartość m-tej liczby pierwszej
        } else {
            return -1; // liczby spoza zakresu (wartość liczby pierwszej większa niż zadane "n" lub mniejsze m od zera)
        }
    }

    // Metoda sprawdzająca, czy przekazana liczba jest pierwszą
    private boolean czyPierwsza(int num) {
        if (num < 2) { // 1 i niżej nie są liczbami pierwszymi
            return false;
        } else if (num == 2) { // 2 jest liczbą pierwszą
            return true;
        } else if (num % 2 == 0) { // liczby podzielne przez 2 nie są pierwsze
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) { // przy kolejnej iteracji zwiększamy i od razu o 2
            if (num % i == 0) { // sprawdzamy, czy podana liczba jest podzielna przez kolejno 3, 5, 7, zakładając i <= sqrt(num)
                return false; // jeśli jest podzielne, to znaczy, że nie jest liczbą pierwszą 
            } // przykład dla num = 9 (false) oraz num = 7 (true), pierwiastek z 7 to 2.64, zatem drugi warunek pętli nie jest spełniony
        } 
        // zatem przechodzimy na true, czyli liczba 7 jest liczbą pierwszą
        return true;
    }

}