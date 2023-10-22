package sort;

import jdk.nashorn.internal.ir.CallNode;

public class MaoPao {
    public static void main(String[] args) {
        MaoPao maoPao = new MaoPao();
        int[] a={2,3,1,5,6,7,3,4,9,18,26,25,35,19,10};
        maoPao.sort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public void sort(int[] arr){
        int len = arr.length - 1;
        boolean flag=true;
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len-i; j++) {
                if (arr[j]>arr[j+1]){
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (flag){
                break;
            }
        }
    }
}
