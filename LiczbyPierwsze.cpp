#include <vector>
#include <cmath>
#include "LiczbyPierwsze.hpp"

LiczbyPierwsze::LiczbyPierwsze(int n) {
    for (int i = 2; i <= n; i++) {
        if (czyPierwsza(i)) {
            liczbyPierwsze.push_back(i);
        }
    }
}

int LiczbyPierwsze::liczba(int m) {
    if (m < liczbyPierwsze.size() && m >= 0) {
        return liczbyPierwsze.at(m);
    } else {
        return -1;
    }
}

bool LiczbyPierwsze::czyPierwsza(int num) {
    if (num < 2) {
        return false;
    } else if (num == 2) {
        return true;
    } else if (num % 2 == 0) {
        return false;
    }

    for (int i = 3; i <= sqrt(num); i += 2) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

LiczbyPierwsze::~LiczbyPierwsze() {
    
}