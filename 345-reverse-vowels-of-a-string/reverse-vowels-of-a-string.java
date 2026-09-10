class Solution {
    public String reverseVowels(String s) {
        // Convert to a mutable character array
        char[] chars = s.toCharArray();
        
        // Pass the array to your recursive function
        rev(chars, 0, chars.length - 1);
        
        // Convert the array back to a String
        return new String(chars);
    }
    
    public void rev(char[] chars, int i, int j) {
        if (i >= j) { // Changed to >= to stop early if pointers meet
            return;
        }
        
        if (isV(chars[i]) && isV(chars[j])) {
            // Correct swapping using a third variable on the char array
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            
            rev(chars, i + 1, j - 1);
        }
        else if (isV(chars[i]) && !isV(chars[j])) {
            rev(chars, i, j - 1);
        }
        else {
            rev(chars, i + 1, j);
        }
    }
    
    public boolean isV(char x) {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || 
               x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U';
    }
}