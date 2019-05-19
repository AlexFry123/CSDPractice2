

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task 1: print Tic-Tak 5 times.");
        Data    d = new Data();
        DataTask2 d2 = new DataTask2();
        Worker w2=new Worker(2, d);
        Worker w1=new Worker(1, d);
        w2.join();

        System.out.println("Task2 : print Tic-Tak-Toy using third thread");
        WorkerTask2 wT3 = new WorkerTask2(3,d2);
        WorkerTask2 wT2 = new WorkerTask2(2,d2);
        WorkerTask2 wT1 = new WorkerTask2(1,d2);

        wT2.join();
        wT3.join();
        System.out.println("end of main...");
    }
}
