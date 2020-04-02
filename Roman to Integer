class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map=new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int sum=0;
        int curr=0;
        int prev=0;
        char[] ch=s.toCharArray();
        for(int i=ch.length-1; i>=0; i--) {
            curr=map.get(ch[i]);
            if(curr>=prev) {
                sum+=curr;
            } else {
                sum-=curr;
            }
            prev=curr;
        }
        
        return Math.abs(sum);
    }
}
