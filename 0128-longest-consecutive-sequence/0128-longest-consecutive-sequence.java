import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Iterate over unique numbers
        for (int num : set) {

            // Start only if there is no previous number
            if (!set.contains(num - 1)) {

                int current = num;
                int len = 1;

                // Prevent integer overflow
                while (current != Integer.MAX_VALUE &&
                       set.contains(current + 1)) {
                    current++;
                    len++;
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}