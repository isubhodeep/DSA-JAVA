class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
        int L = arr[i-1];//2-1 =1
        int R = arr[i-2];//2-2 =1
        arr[i]=L+R;
        }
        return arr[n];
    }
    // public int logic(int n, int arr[]){ //2
    //     if(n==1) return 1;
    //     if(n==0) return 1;
    //     if(arr[n]!=0)
    //     return arr[n];
    //     int L = logic(n-1,arr);//2-1 =1
    //     int R = logic(n-2,arr);//2-2 =1
    //     return arr[n]=L+R;
    // }
}
// 4
// arr[0,0,2,0,0] = initial
// arr[0,1,2,3,4] = index
// arr[1,1,2,3,5] = final