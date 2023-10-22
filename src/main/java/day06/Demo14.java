package day06;

public class Demo14 {
    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length==0) return 0;
        int firstPosition = findFirstPosition(nums, target);
        if (firstPosition==-1) return 0;
        int lastPosition = findLastPosition(nums, target);
        return lastPosition-firstPosition+1;
    }

    private int findFirstPosition(int[] nums,int target){
        int l=0,r= nums.length-1;
        while (l<r){
            int mid=(r+l)/2;
            if (nums[mid]<target){
                l=mid+1;
            }else {
                r=mid;
            }
        }
        if (nums[l]==target){
            return l;
        }
        return -1;
    }
    private int findLastPosition(int[] nums,int target){
        int l=0;
        int r= nums.length-1;
        while (l<r){
            int mid=l+(r-l+1)/2;
            if (nums[mid]<=target){
                l=mid;
            }else {
                r=mid-1;
            }
        }
        return l;
    }
    
}
