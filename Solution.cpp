
#include <vector>
using namespace std;

class Solution {

public:
    int minNumberOperations(vector<int>& target) const {
        int minNumberOperations = target[target.size() - 1];
        for (int i = 1; i < target.size(); ++i) {
            if (target[i] < target[i - 1]) {
                    minNumberOperations += target[i - 1] - target[i];
            }
        }
        return minNumberOperations;
    }
};
