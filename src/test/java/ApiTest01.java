import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ThreadPoolExecutor;

public class ApiTest01 {

    @Test
    public void test04(){

        Deque deque=new ArrayDeque<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.removeFirst();
        System.out.println(deque);

    }
    @Test
    public void test045(){

    }



    @Test
    public void test01(){
        Thread thread = new Thread(()->{
        });
        thread.start();
        System.out.println(thread.getState());
        System.out.println(thread.getState());
    }

    @Test
    public void test02() throws InterruptedException {
        Object obj = new Object();
        Thread thread = new Thread(() -> {
            synchronized (obj) {
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        while (true) {
            Thread.sleep(1000);
            System.out.println(thread.getState());
        }

    }
}
