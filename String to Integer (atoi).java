class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        
        int index=0;
        int startIndex=0;
        boolean negative=false;
        while(str.length()>index && str.charAt(index)==' ') {
            index++;
        }
        if(index>=str.length()) {
            return 0;
        }
        
        if(str.charAt(index)=='+') {
            index++;
        } else if(str.charAt(index)=='-') {
            index++;
            negative=true;
        }
        
        if(index>=str.length()) {
            return 0;
        }
        
        if(Character.isDigit(str.charAt(index))==false) {
            return 0;
        } else {
            startIndex=index;
        }
        int endIndex=startIndex;
        for(int i=startIndex; i<str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                endIndex++;
            } else {
                break;
            }
        }
        double num=0;
        for(int i=startIndex; i<endIndex; i++) {
            num=(num*10)+Double.parseDouble(Character.toString(str.charAt(i)));
        }
        if(num>Integer.MAX_VALUE) {
            return (negative)?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        
        return negative?(int)(-1*num):(int)num;
    }
}
