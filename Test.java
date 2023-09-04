public class Test {
    public static void main(String[] args) {
        
        if (args.length < 1) { // jeśli nie podamy nawet zakresu
            System.out.println("Nieprawidlowy zakres");
        }

        int n = Integer.parseInt(args[0]);

        LiczbyPierwsze lp = new LiczbyPierwsze(n);

        System.out.println("Zakres to: " + args[0]);
     
        for (int i = 1; i < args.length; i++) {
            try {
                int m = Integer.parseInt(args[i]);
                int liczba = lp.liczba(m);

                if (liczba == -1) {
                    System.out.println(m + " - wartosc dla tego indeksu wychodzi poza zakres");
                } else {
                    System.out.println("Dla indeksu " + m + " - wartosc liczby pierwszej wynosi: " + liczba);
                }
            } catch (NumberFormatException e) {
                System.out.println(args[i] + " - nieprawidlowa dana");
            }
        }
    }
}
