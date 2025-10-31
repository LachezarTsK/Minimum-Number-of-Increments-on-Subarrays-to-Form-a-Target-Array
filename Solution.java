
public class Solution {

    public int minNumberOperations(int[] target) {
        int minNumberOperations = target[target.length - 1];
        for (int i = 1; i < target.length; ++i) {
            if (target[i] < target[i - 1]) {
                minNumberOperations += target[i - 1] - target[i];
            }
        }
        return minNumberOperations;
    }
}
