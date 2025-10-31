
function minNumberOperations(target: number[]): number {
    let minNumberOperations = target[target.length - 1];
    for (let i = 1; i < target.length; ++i) {
        if (target[i] < target[i - 1]) {
            minNumberOperations += target[i - 1] - target[i];
        }
    }
    return minNumberOperations;
};
