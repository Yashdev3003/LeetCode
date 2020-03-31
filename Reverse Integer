class Solution {
    public int reverse(int x) {
        int y=x;
        boolean negative=false;
        if(x<0) {
            x=(-1)*x;
            negative=true;
        }
        
        double reversed=0;
        while(x>0) {
            int pop=x%10;
            reversed=(reversed*10)+pop;
            x/=10;
        }
        if(reversed>Integer.MAX_VALUE) {
            return 0;
        } else {
            return negative==true?(-1)*(int)reversed:(int)reversed;
        }
        
    }
}
