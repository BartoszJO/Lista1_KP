#include <vector>

using namespace std;

class LiczbyPierwsze {
 private:
    vector<int> liczbyPierwsze;
    bool czyPierwsza(int num);
 public:
    LiczbyPierwsze(int n);
    ~LiczbyPierwsze();
    int liczba(int m);
};