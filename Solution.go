
package main

func minNumberOperations(target []int) int {
    minNumberOperations := target[len(target) - 1]
    for i := 1; i < len(target); i++ {
        if target[i] < target[i - 1] {
            minNumberOperations += target[i - 1] - target[i]
        }
    }
    return minNumberOperations
}
