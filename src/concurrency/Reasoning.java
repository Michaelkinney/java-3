package concurrency;

class Reasoning extends Thread{

    public void distinguish() {
        System.out.println("A Thread is a single action and a process is executing a program.  There are multiple threads within a process.");
        System.out.println("Start() begins the process where run() doesn't operate on the new thread but on the current thread.");
    }
    public void run(){
        distinguish();
        System.out.println("Running Reasoning");
    }
}
