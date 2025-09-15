class Solution(object):
    def pivotIndex(self, arr):
        s=sum(arr)
        l=0
        for i in range(len(arr)):
            if(((s-arr[i])//2)==l and (s-arr[i])%2==0):
                return i
            l+=arr[i]
        return -1
        