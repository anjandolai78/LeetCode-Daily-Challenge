
class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;

        // 1. Prefix maximum
        int[] prefMax = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefMax[i + 1] =
                Math.max(prefMax[i], nums[i]);
        }

        // 2. Suffix minimum
        int[] suffMin = new int[n + 1];
        suffMin[n] = 1_000_000_000;

        for (int i = n - 1; i >= 0; i--) {
            suffMin[i] =
                Math.min(nums[i], suffMin[i + 1]);
        }

        // 3. Prefix count of adjacent descents
        int[] prefDrop = new int[n];

        for (int i = 1; i < n; i++) {
            prefDrop[i] = prefDrop[i - 1];

            if (nums[i - 1] > nums[i]) {
                prefDrop[i]++;
            }
        }

        // 4. Check all divisors of n
        int ans = 0;

        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {

                if (check(nums, prefMax, suffMin,
                          prefDrop, i)) {
                    ans += i;
                }

                int other = n / i;

                if (other != i &&
                    check(nums, prefMax, suffMin,
                          prefDrop, other)) {
                    ans += other;
                }
            }
        }

        return ans;
    }

    private boolean check(
        int[] nums,
        int[] prefMax,
        int[] suffMin,
        int[] prefDrop,
        int k
    ) {
        int n = nums.length;

        for (int start = 0; start < n; start += k) {
            int end = start + k - 1;

           
            int drops =
                prefDrop[end] - prefDrop[start];

            if (nums[end] > nums[start]) {
                drops++;
            }

            if (drops > 1) {
                return false;
            }

            
            if (prefMax[start] > suffMin[start]) {
                return false;
            }
        }

        return true;
    }
}
