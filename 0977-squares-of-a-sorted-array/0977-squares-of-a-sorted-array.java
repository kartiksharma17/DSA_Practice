class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                pos.add(i);
            } else {
                neg.add(i);
            }
        }

        // All numbers are negative
        if (pos.size() == 0) {

            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }

            // Reverse the squared array
            for (int left = 0, right = nums.length - 1; left < right; left++, right--) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            return nums;
        }

        // All numbers are non-negative
        else if (neg.size() == 0) {

            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }

            return nums;
        }

        // Mixed negative and positive numbers
        else {

            int[] ans = new int[nums.length];

            int i = neg.size() - 1; // last negative index
            int j = 0;              // first positive index
            int idx = 0;

            while (i >= 0 && j < pos.size()) {

                int negSq = nums[neg.get(i)] * nums[neg.get(i)];
                int posSq = nums[pos.get(j)] * nums[pos.get(j)];

                if (negSq <= posSq) {
                    ans[idx++] = negSq;
                    i--;
                } else {
                    ans[idx++] = posSq;
                    j++;
                }
            }

            while (i >= 0) {
                ans[idx++] = nums[neg.get(i)] * nums[neg.get(i)];
                i--;
            }

            while (j < pos.size()) {
                ans[idx++] = nums[pos.get(j)] * nums[pos.get(j)];
                j++;
            }

            return ans;
        }
    }
}