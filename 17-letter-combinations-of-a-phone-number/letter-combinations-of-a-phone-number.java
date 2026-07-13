class Solution {

    static String[] key = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> d = new ArrayList<>();
        if (digits.length() == 0) return d;

        keypaid(digits, "", d);
        return d;
    }

    public static void keypaid(String ques, String ans, List<String> d) {

        // base case
        if (ques.length() == 0) {
            d.add(ans);
            return;
        }

        char ch = ques.charAt(0);        // '2'
        String get = key[ch - '0'];      // "abc"

        for (int i = 0; i < get.length(); i++) {
            keypaid(ques.substring(1), ans + get.charAt(i), d);
        }
    }
}
