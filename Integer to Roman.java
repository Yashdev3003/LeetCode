class Solution {
    public String intToRoman(int num) {
        int [] arr={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>num) {
                continue;
            } else {
                String s=new String();
                if(num==arr[i]) {
                    s+=str[i];
                    return s;
                } else {
                    int j=i;
                    while(num!=0) {
                        if(num<arr[j]) {
                            j++;
                        } else {
                            s+=str[j];
                            num-=arr[j];
                        }
                    }
                    return s;
                }
            }
        }
        return "";
    }
}
