class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr=new ArrayList();
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    List<Integer> newArr=new ArrayList();
                    int c=0;
                    if(nums[i]+nums[j]+nums[k]==0) {
                        newArr.add(nums[i]);
                        newArr.add(nums[j]);
                        newArr.add(nums[k]);
                        Collections.sort(newArr);
                        if(arr.contains(newArr)) {
                            c=1;
                            break;
                        }
                        if(c==0) {
                            arr.add(newArr);
                        }
                    }
                }
            }
        }
        return arr;
    }
}
