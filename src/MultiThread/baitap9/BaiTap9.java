package MultiThread.baitap9;

public class BaiTap9 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(
            () -> {
                for (int i = 0; i < 100000; i++) {
                    counter.increment();
                }
            }
        );
        Thread t2 = new Thread(
            () -> {
                for (int i = 0; i < 100000; i++) {
                    counter.increment();
                }
            }
        );
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Counter: " + counter.getCount());
    }
}
