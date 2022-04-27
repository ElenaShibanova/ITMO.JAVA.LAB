package lessons.lesson14;

public class NameThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100){
            i++;
            currentThread().notify();
            System.out.println("Name of thread: " + currentThread().getName());
            try {
                currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
