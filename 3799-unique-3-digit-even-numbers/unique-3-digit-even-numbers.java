class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int count = 0;
        for (int h = 1; h <= 9; h++) {      // hundreds place
            if (freq[h] == 0) continue;
            freq[h]--;
            for (int t = 0; t <= 9; t++) {  // tens place
                if (freq[t] == 0) continue;
                freq[t]--;
                for (int u = 0; u <= 8; u += 2) { // units place must be even
                    if (freq[u] > 0) {
                        count++;
                    }
                }
                freq[t]++;
            }
            freq[h]++;
        }
        return count;
    }
}