package study;

import javax.xml.bind.annotation.XmlType;
import java.util.*;

public class Demo1 {


    public static void main(String[] args) {
/*        String[] split = new Demo1().split("&&&&  ");
        for (String s : split) {
            System.out.println(s);
        }*/
        System.out.println(new Demo1().getMaxZhishu(100));

    }

    public int search(int[] arr, int num) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == num) return arr[mid];
            if (arr[mid] > num) r = mid - 1;
            if (arr[mid] < num) l = mid + 1;
        }
        //没找到
        return -1;
    }

    public String[] split(String str) {
        ArrayList<String> list = new ArrayList<>();
        while (!str.isEmpty()) {
            //如果字符串存在&& 将其前部分加入list
            if (str.contains("&&")) {
                int index = str.indexOf("&&");
                list.add(str.substring(0, index));
                str = str.substring(index + 2);
            } else {
                list.add(str);
                break;
            }
        }
        return list.toArray(new String[list.size()]);
    }

    //实现字符串组合，如[“ab”,”2”]通过”&&”分隔符，组合成字符串”ab&&2”
    public String join(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            //最后一个不用加&&
            if (i == arr.length - 1) builder.append(arr[i]);
            else builder.append(arr[i] + "&&");
        }
        return builder.toString();
    }

    public int getMaxZhishu(int n) {
        for (int i = n; i >= 2; i--) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    return i;
                }
            }
        }
        //没找到质数
        return -1;
    }

    //1000个数范围是[0,999]，有且只有2个相同的数，请编写程序找出来
    public int select(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 1000; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        //没有相同数返回-1
        return -1;
    }
    // n个人(编号1~n)围成一圈从编号为1的开始报数，从1报数到m，报到m的人出来，下一个人继续重新从1开始报数，编程求最后一个留下的人的编号
    //如n=3，m=4
    //第一次出队：1
    //第二次出队：3
    //最后留下：2
    public int last(int n,int m){
        ArrayList<Integer> list = new ArrayList<>();
        //给队赋值
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; i < n - 1; i++) {
            if (m<list.size()-1) list.remove(m-1);
            if (m>list.size()-1) {
                list.remove(m-list.size()-1);
            }
        }
        //剩下一个就是最后留的
        return list.get(0);
    }
    //有26个字母a-z，找出所有字母的组合，a、b、c、ab、abc、a~z都是一个组合(顺序无关)
    public void zuhe(){
        char[] chars=new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char)('a' + i);
        }
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            StringBuilder builder = new StringBuilder();
            list.add(chars[i]+"");
            for (int j = i+1; j <chars.length ; j++) {
                list.add(chars[i]+""+chars[j]);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        
    }


    /*public void backtracking(int n,int k,int startIndex){
        if (path.size()==k){
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtracking(n,k,startIndex);
            path.re
        }
    }*/

    List<List<Integer>> result= new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }

    public void backtracking(int n,int k,int startIndex){
        if (path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i =startIndex;i<=n;i++){
            path.add(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }
    }










}
