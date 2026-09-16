import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        // Add all elements of nums1
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> ll = new ArrayList<>();
        // Check nums2
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ll.add(nums2[i]);
                set.remove(nums2[i]);  // prevent duplicates
            }
        }
        // Convert List<Integer> to int[]
        int[] result = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            result[i] = ll.get(i);
        }
        return result;
    }
}