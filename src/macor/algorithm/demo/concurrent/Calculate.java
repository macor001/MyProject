package macor.algorithm.demo.concurrent;

public class Calculate {
    private long count = 0;
    private void add(int number){
        int idx = 0;
        while (idx ++ < number){
            count += 1;
        }
    }

    public static long calc(int number){
        final Calculate cal = new Calculate();
        Thread thread1 = new Thread(()->{cal.add(number);});
        Thread thread2 = new Thread(()->{cal.add(number);});
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cal.count;
    }
}
