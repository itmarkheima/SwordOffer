package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] a={1,4,2,8,5,9,45,34,90,67,-13,109,9};
        new SelectSort().selectSort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    public void selectSort(int[] arr){
        int len = arr.length-1;
        for (int i = 0; i < len; i++) {//选择排序次数
            int min=arr[i];
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }

            if (i!=minIndex){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }

        }

    }
}
