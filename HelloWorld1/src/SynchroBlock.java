public class SynchroBlock {

    void count(int n){
        synchronized(this) {
            for (int i = 0; i < 10; i++) {
                n = n*i;
            }
            System.out.println(n);
            try {
                Thread.sleep(500);
            } catch(Exception e){System.out.println(e);} 
        }
    }

}
    class MyThread1 extends Thread{    
        SynchroBlock c;    
        MyThread1(SynchroBlock c) {    
            this.c=c;    
        }    
        public void run(){    
            c.count(5);    
        }    
    
    }    
    
    class MyThread2 extends Thread{    
        SynchroBlock c;    
        MyThread2(SynchroBlock c){    
            this.c=c;    
        }    
        public void run(){    
            c.count(8);    
        }    
    }    
    
    class TestSynchronizedBlock1{    
        public static void main(String args[]){    
            SynchroBlock obj = new SynchroBlock();
            MyThread1 t1=new MyThread1(obj);    
            MyThread2 t2=new MyThread2(obj);    
            t1.start();    
            t2.start();    
        }    
    } 