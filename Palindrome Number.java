class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int num=x;
        
        double reversed=0;
        while(x>0) {
            int pop=x%10;
            reversed=(reversed*10) + (double)pop;
            x/=10;
        }
        if(num==reversed) {
            return true;
        } else {
            return false;
        }
    }
}
