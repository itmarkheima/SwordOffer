package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={2,1,45,54,7,8,97,-1,109,77,64};
        QuickSort.quickSort(a,0,a.length-1);
        for (int i : a) {
            System.out.print(i+" ");
        }

    }
    public  void quickSort2(int[] nums,int left,int right){
        if (left>=right) return;
        int num=nums[left];


    }


    public static void quickSort(int[] arr,int left,int right){
        if (left>=right){
            //递归退出条件
            return;
        }
        int l=left;
        int r=right;

        while (l<r){
            while (l<r && arr[left]<=arr[r]) r--;
            while (l<r && arr[left]>=arr[l]) l++;
            if (l==r){
                int temp=arr[r];
                arr[r]=arr[left];
                arr[left]=temp;
            }
            if (l!=r){
                int temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
            }
        }
        quickSort(arr,0,l-1);
        quickSort(arr,r+1,right);
    }
}
