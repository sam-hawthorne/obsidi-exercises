public class threadPractice {
    class ExecuteThread {
        public static void main(String[] args) {
        MyThread t1 = new MyThread(10);
        MyThread t2 = new MyThread(10);
        t1.start();
        t2.start();
        }
    }
}

class MyThread extends Thread {
    int limitToStop;
    public MyThread(int limitToStop) {
        this.limitToStop = limitToStop;
    }

    public void run() {
        for (int i = 0; i < limitToStop; i++) {
            if ((i % 2) == 0) {
                i++;
            }
                else {
                    System.out.println(i);
                    i++;
                }
        }
        try{
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }  
    }
}