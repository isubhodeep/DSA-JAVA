class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,k,l=m+n;
        for(i=l-1;i>=l-m;i--){
            nums1[i]=nums1[i-n];
        }
        j=l-m;
        k=0;
        i=0;
        while(j<l && k<n){
            if(nums1[j]<=nums2[k]){
                nums1[i++]=nums1[j++];
            }
            else
            nums1[i++]=nums2[k++];
        }
        while(j<l){
            nums1[i++]=nums1[j++];
        }
        while(k<n){
            nums1[i++]=nums2[k++];
        }
    }
}