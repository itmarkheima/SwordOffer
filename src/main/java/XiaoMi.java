import sun.security.timestamp.TSRequest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class XiaoMi {


    public static void main(String[] args){
       StringBuilder str=new StringBuilder();
       str.append("2");

        System.out.println(str.toString());

    }



    public int test2(int n,int[] nums){
        int[] dp=new int[n];
        dp[0]=0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                dp[i] = dp[i-1] + 1;
                nums[i]+=1;
            }
            else dp[i] = dp[i - 1];
        }

        return dp[n-1];
    }


}
