class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        ///if our pivot is at 0th position that means it is not rotated so aplly simple binary search

        if(pivot ==0){
            return binarySearch(nums, target, 0 , nums.length-1);
        }
        else if(target>= nums[0]){
            return binarySearch(nums,target, 0 , pivot-1);
        }else{
            return binarySearch(nums, target, pivot, nums.length - 1);
        }


        
        
    }

    public int binarySearch(int nums[], int target, int start, int end){

        while(start <= end){
            int mid = start +(end-start)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target> nums[mid]){
                start =mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }


    int findPivot(int nums[]){
        int start =0;
        int end= nums.length-1;

        while(start<end){
            int  mid = start +(end-start)/2;

            if(nums[mid]<nums[end]){
                //we know we are in ascending
                end=mid; //no need to check on right side
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
