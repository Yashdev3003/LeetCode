class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void nextPermutation(int[] nums) {
        if(nums.length==1) {
            return;
        }
        if(nums.length==2) {
            swap(nums, 0, 1);
            return;
        }
        int num=0;
        int index=0;
        int reqNum=0;
        int diff=Integer.MAX_VALUE;
        int reqNum_index=0;
        int c=0;
        for(int i=nums.length-1; i>0; i--) {
            int x=nums[i];
            if(x<=nums[i-1]) {
                continue;
            } else {
                c=1;
                num=nums[i-1];
                index=i-1;
                break;
            }
        }    
        if(c==0) {
            Arrays.sort(nums);
            return;
        }
        for(int i=index+1; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if(nums[i]>nums[j]) {
                    swap(nums, i, j);
                }
            }
            if(diff>(nums[i]-num) && (nums[i]-num)>0) {
                diff=nums[i]-num;
                reqNum=nums[i];
                reqNum_index=i;
            }
        }
        swap(nums, reqNum_index, index);
    }
}
