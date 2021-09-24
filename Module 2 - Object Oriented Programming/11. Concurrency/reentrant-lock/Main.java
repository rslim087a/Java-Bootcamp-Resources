public class Main {
    
    static int counter = 0;
    
    public static void main(String[] args) {
    
    }
    
    public static void task() {
        //some really long operations that need to be multi-threaded...
        counter++; // there happens to be a line that updates the counter variable. 
        //more really long operations...
    }
  
}
