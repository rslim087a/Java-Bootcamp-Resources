import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
 
    static String[] files = new String[] { "data/sales1.csv", "data/sales2.csv", "data/sales3.csv"};
   
    static int sampleSize = 0;
    static double quantitySold = 0;


    public static void main(String[] args) throws Exception {
      
      
    }

    /**
     * Function name: increment
     * @param file
     * @param latch
     * @param lock
     * 
     * Inside the function:
     *   1. Runs through the every line in the file.
     *   2. Maps each element in the stream to a quantity value.
     *   3. Increments sampleSize and quantitySold.
     */


}
