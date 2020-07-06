//This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.  In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).  There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List  After all the names have been pushed to this List, print out the entire list of all the students in your TA group. Don't forget your TA as well!  All of these steps should be done whenever the thread is started.  (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package.
package concurrency;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.concurrent.TimeUnit;

class TeamTC1 implements Runnable {

    String name;

    public TeamTC1(String name){
        this.name = "V8";
    }

    List<String> team = new ArrayList<>();

    String TA = "Emelios";
    String student1 = "Abigail";
    String student2 = "Adam";
    String student3 = "Christian";
    String student4 = "Devon";
    String student5 = "Marcelo";
    String student6 = "Michael";
    String student7 = "Monica";
    String student8 = "Jose";
    String student9 = "Julian";
    String student10 = "Phoenix";

    public void run(){
        try {
            System.out.println(TA);
            team.add(TA);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student1);
        try {
            team.add(student1);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student2);
        try {
            team.add(student2);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student3);
        try {
            team.add(student3);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student4);
        try {
            team.add(student4);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student5);
        try {
            team.add(student5);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student6);
        try {
            team.add(student5);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student7);
        try {
            team.add(student6);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student8);
        try {
            team.add(student8);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student9);
        try {
            team.add(student9);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student10);
        try {
            team.add(student10);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int x = 0; x < team.size(); x++){
            System.out.println(team.get(x));
        }
    }
}