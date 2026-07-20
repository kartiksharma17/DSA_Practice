class Solution {
    public int[] plusOne(int[] digits) {
        // Traverse the array from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 and carry continues
            digits[i] = 0;
        }

        // If all digits were 9, create a new array with an extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}