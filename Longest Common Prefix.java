class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) {
            return "";
        }
        
        int n=strs.length;
        String s=new String();
        int minLength=Integer.MAX_VALUE;
        int index=0;
        for(int i=0; i<strs.length; i++) {
            if(strs[i].length()<minLength) {
                minLength=strs[i].length();
                index=i;
            }
        }
        
        char[] ch=strs[index].toCharArray();
        for(int i=0; i<ch.length; i++) {
            int c=0;
            for(int j=0; j<n; j++) {
                if(strs[j].charAt(i)!=ch[i]) {
                    c=1;
                    break;
                }
            }
            if(c==0) {
                s+=Character.toString(ch[i]);
            } else {
                break;
            }
        }
        
        return s;
    }
}
