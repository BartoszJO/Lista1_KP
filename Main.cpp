#include <iostream>
#include <string>
#include "LiczbyPierwsze.hpp"

using namespace std;

int main(int argc, char* argv[]) {
    if (argc == 1) {
        cout << "Nieprawidlowy zakres" << endl;
    }

    try {
        int n = stoi(argv[1]);
    } catch (const invalid_argument& e) {
        cout << "Nieprawidlowy zakres - zla dana" << endl;
    }

    int n = stoi(argv[1]);

    if (n < 2) {
        cout << "Zakres musi byc przynajmniej 2" << endl;
    }

    LiczbyPierwsze lp(n);

    cout << "Zakres to: " << n << endl;

    if (argc <= 1) {
        cout << "Nie podano argumentow" << endl;
    }

    for (int i = 2; i < argc; i++) {
        try {
            int m = stoi(argv[i]);
            int liczba = lp.liczba(m);

            if (liczba == -1) {
                cout << m << " - wartosc dla tego indeksu wychodzi poza zakres" << endl;
            } else {
                cout << "Dla indeksu " << m << " - wartosc liczby pierwszej wynosi: " << liczba << endl;
            }
        } catch (const invalid_argument& e) {
            cout << argv[i] << " - nieprawidlowa dana" << endl;
        }
    }
    return 0;
}