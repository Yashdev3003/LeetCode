class Solution {
    public String longestPalindrome(String s) {
        if(s=="") {
            return "";
        }
        char[] x=s.toCharArray();
        String str=new String();
        int j=0;
        while(j<s.length()) {
            for(int i=0; i<s.length(); i++) {
                int left=j;
                int right=s.length()-1-i;
                int end=right;
                while(left<=right && x[left]==x[right]) {
                    left++;
                    right--;
                    if(left>=right) {
                        if(str.length()<s.substring(j, end+1).length()) {
                            str=s.substring(j, end+1);
                        } 
                    }
                }
            }
            j++;
        }
        return str;
    }
}
