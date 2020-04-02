class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=0;
        for(int i=0; i<s.length(); i++) {
            String string=new String();
            for(int j=i; j<s.length(); j++) {
                int c=0;
                for(int k=0; k<string.length(); k++) {
                    if(string.charAt(k)==s.charAt(j)) {
                        c=1;
                        break;
                    }
                }
                if(c==0) {
                    string+=Character.toString(s.charAt(j));
                } else {
                    break;
                }
            }
            if(maxCount<string.length()) {
                maxCount=string.length();
            }
        }
        
        return maxCount;
    }
}
