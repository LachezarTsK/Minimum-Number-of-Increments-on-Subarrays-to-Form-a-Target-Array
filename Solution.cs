
using System;

public class Solution
{
    public int MinNumberOperations(int[] target)
    {
        int minNumberOperations = target[target.Length - 1];
        for (int i = 1; i < target.Length; ++i)
        {
            if (target[i] < target[i - 1])
            {
                minNumberOperations += target[i - 1] - target[i];
            }
        }
        return minNumberOperations;
    }
}
