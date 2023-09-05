public class Test {
    public static void main(String[] args) {
        
        if (args.length == 0) { // jeśli nie podamy nawet zakresu
            System.out.println("Nieprawidlowy zakres");
            System.exit(1); // dzięki tej linijce kodu nie otrzymamy komunikatu o błędzie, tylko to co sami napisaliśmy
        }

        // Tutaj sprawdzamy, czy zakres jest zmienną odpowiedniego typu (int)
        try {
           int n = Integer.parseInt(args[0]); 
        } catch (NumberFormatException e) {
            System.out.println("Nieprawidlowy zakres - zla dana");
            System.exit(1);
        }
        
        int n = Integer.parseInt(args[0]); // Musimy powtórzyć linijkę (chyba - do poprawy)

        // Zakres > 2 oraz < n
        if (n < 2) {
            System.out.println("Zakres musi byc przynajmniej 2");
            System.exit(1);
        }

        // Tworzymy obiewkt klasy LiczbyPierwsze o nazwie "lp" i przekazujemy mu parametr "n", czyli args[0]
        LiczbyPierwsze lp = new LiczbyPierwsze(n);

        System.out.println("Zakres to: " + args[0]); // wypisanie zakresu

        // Jeśli podamy sam zakres
        if (args.length <= 1) {
            System.out.println("Nie podano argumentow");
        }
     
        // W pętli wypisujemy wartości dla parametrów, pętla działa, dopóki nie skończą się argumenty
        for (int i = 1; i < args.length; i++) {
            try {
                int m = Integer.parseInt(args[i]); // przypisujemy kolejne args do m
                int liczba = lp.liczba(m); // do zmiennej liczba (int) przypisujemy wynik metody liczba() dla parametru "m" oraz obiektu lp
                // PRZEANALIZOWAĆ PO KOLEI DZIALANIE KODU !!!

                if (liczba == -1) { // wcześniej ustalone -1 dla metody liczba() oznacza wyjście poza zakres
                    System.out.println(m + " - wartosc dla tego indeksu wychodzi poza zakres"); // wypisujemy indeks elementu 
                } else {
                    System.out.println("Dla indeksu " + m + " - wartosc liczby pierwszej wynosi: " + liczba); // Poprawne - indeks i wartość tej (m-tej lub n - tej) liczby pierwszej
                }
            } catch (NumberFormatException e) { // przy nieudanym parsowaniu m-tego elementu (np. dla parametru "aaa")
                System.out.println(args[i] + " - nieprawidlowa dana");
            }
        }
    }
}
