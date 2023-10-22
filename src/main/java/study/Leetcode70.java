package study;

import java.util.HashMap;

public class Leetcode70 {
    //爬楼梯
    //递归方法
    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

    HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {


        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.get(n)!=null){
            return map.get(n);
        }
        else {
            int result=climbStairs(n-1)+climbStairs(n-2);
            map.put(n,result);
            return result;
        }
    }



}
