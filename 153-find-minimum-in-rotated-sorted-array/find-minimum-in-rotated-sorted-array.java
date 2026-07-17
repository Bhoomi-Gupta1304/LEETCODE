class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than right, min is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, min is in the left half (including mid)
                right = mid;
            }
        }

        // left == right -> minimum element
        return nums[left];
    }
}
