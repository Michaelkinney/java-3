package concurrency;

public class Main {

    public static void main(String[] args) {
        concurrency.Reasoning reason = new concurrency.Reasoning();
        reason.start();
        concurrency.TeamTC1 tc3 = new concurrency.TeamTC1("V8");
        Thread t1 = new Thread(tc3);
        t1.start();
    }
}