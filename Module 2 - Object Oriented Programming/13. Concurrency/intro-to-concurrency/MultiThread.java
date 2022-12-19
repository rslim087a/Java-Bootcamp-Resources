public class MultiThread {

    public static void main(String[] args) {

        System.out.println("Doing other work on main thread");
        
    }

    public static void longTask() {
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
