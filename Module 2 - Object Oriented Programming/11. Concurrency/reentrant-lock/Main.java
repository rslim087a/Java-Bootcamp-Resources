public class Main {
    
    static int counter = 0;
    
    public static void main(String[] args) {
    
    }
    
    public static void task() {
        //some really long operations that need to run in the background...
        for (int i = 0; i < 10000; i++) {
            counter++; // there happens to be a line that updates the counter variable. 
        }
        //more really long operations...
    }
  
}
