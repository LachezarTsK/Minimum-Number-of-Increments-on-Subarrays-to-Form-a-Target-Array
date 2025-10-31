
class Solution {

    fun minNumberOperations(target: IntArray): Int {
        var minNumberOperations = target[target.size - 1]
        for (i in 1..<target.size) {
            if (target[i] < target[i - 1]) {
                minNumberOperations += target[i - 1] - target[i]
            }
        }
        return minNumberOperations
    }
}
