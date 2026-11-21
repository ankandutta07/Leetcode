
class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                int left = i;
                int right = j;
                boolean flag = true;
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        flag = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (flag && j - i + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
}
