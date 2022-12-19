public class Main {
    public static void main(String[] args) {
        // longTask();
        System.out.println("Doing other work on main thread");

    }

    public static void longTask() { //takes 3 seconds to perform this task.
        long t= System.currentTimeMillis();
        long end = t+3000;
        
        while(true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }
}
