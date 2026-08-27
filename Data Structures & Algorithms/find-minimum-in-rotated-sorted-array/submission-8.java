class Solution {
    public int findMin(int[] nums) {

        int start =0;
        int end = nums.length-1;

        while(start < end){
            int mid = start +(end-start)/2;

            if(nums[mid] >nums[end]){
                start = mid+1; // we know solution lies ahead
            }
            else{
                end =mid; // we are in ascendng order
            }
        }
        return nums[start];
    }

}
