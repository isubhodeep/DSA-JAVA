class Solution {
    public int reversePairs(int[] nums) {
        return MergeSort(nums, 0, nums.length-1);
    }
    int MergeSort(int[] arr, int low, int high)
    {
        int c=0;
        if(low>=high)
        return c;
        int mid=(low+high)/2;
        c+=MergeSort(arr, low, mid);
        c+=MergeSort(arr, mid+1, high);
        c+=Merge(arr, low, mid, high);
        return c;
    }
    int Merge(int[] arr, int low, int mid, int high )
    {
        int c=0;
        int i=low;
        int j=mid+1;
        List<Integer>temp=new ArrayList<>();
        for (i = low; i <= mid; i++) {
        while (j <= high && arr[i] > 2L * arr[j]) {
            j++;
        }
        c += (j - (mid + 1));
    }
        i=low;
        j=mid+1;
        while(i<=mid && j<=high)
        {
            if(arr[i]<=arr[j])
            {
               temp.add(arr[i]);
               i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid )
        {
            temp.add(arr[i]);
            i++;
        }
        while(j<=high)
        {
            temp.add(arr[j]);
            j++;
        }
        for(int a=low;a<=high;a++)
        arr[a]=temp.get(a-low);
        return c;
    }
}