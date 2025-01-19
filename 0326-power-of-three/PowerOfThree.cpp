class Solution {
public:
    bool isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        
        // Keep dividing n by 3
        while (n % 3 == 0) {
            n /= 3;
        }

        // If n is 1, it is a power of 3
        return n == 1;
    }
};