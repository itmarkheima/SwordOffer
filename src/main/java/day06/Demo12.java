package day06;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo12 {



      class CQueue {

          LinkedList<Integer> A,B;

        public CQueue() {
            A=new LinkedList<>();
            B=new LinkedList<>();
        }

        public void appendTail(int value) {
            A.add(value);
        }

        public int deleteHead() {
            if (!B.isEmpty()) return B.removeLast();
            if (A.isEmpty()) return -1;
            while (!A.isEmpty()){
                B.add(A.removeLast());
            }
            return B.removeLast();
        }
    }
}
