class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double> a=new ArrayList();
        int i=0, j=0;
        while(i<nums1.length || j<nums2.length) {
            double x=(i<nums1.length)?nums1[i]:Integer.MAX_VALUE;
            double y=(j<nums2.length)?nums2[j]:Integer.MAX_VALUE;
            if(x!=Integer.MAX_VALUE) {
                a.add(x);
            }
            
            if(y!=Integer.MAX_VALUE) {
                a.add(y);
            }
            i++;
            j++;
        }
        Collections.sort(a);
        int y=a.size();
        double median=a.size()%2==0?(a.get(y/2-1)+a.get(y/2))/2:a.get((y+1)/2-1);
        return median;
    }
}
