import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if (s.equals("ik")) break;;
            System.out.println(s);
        }

        String s="yasyg";
        for (int i = 0; i < s.length(); i++) {
            s.charAt(i);
        }
        HashMap<Integer,Integer> map=new HashMap();

        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
        }

    }





    public int[] spiralOrder(int[][] matrix) {
        System.out.println(matrix.length);
        return new int[]{};
    }


}
