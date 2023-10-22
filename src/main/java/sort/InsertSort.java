package sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] a={-1,9,7,89,65,0,78,43,109,18,-18,9,768};
        new InsertSort().insertSort(a);

        for (int i : a) {
            System.out.print(i+ " ");
        }
    }

    public void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {//插入排序次数 length-1
            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i=j;
                }
            }
        }
    }
}
