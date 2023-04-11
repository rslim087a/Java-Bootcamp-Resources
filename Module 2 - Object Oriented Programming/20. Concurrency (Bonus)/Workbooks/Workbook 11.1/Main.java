import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    static final String SALES = "data/sales.csv"; //Use backslash Windows users

    public static void main(String[] args) {
        
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());
            //calculate average sales of "Furniture" here
            //calculate average sales of "Technology" here
            //calculate average sales of "Office Supplies" here
            //calculate total average of sales here

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Function name: average
     * @param path (Path)
     * @param category (String)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three String values.
     *   3. Filters every value by the @param category
     *   4. Maps every element in the stream to a double (price * quantity).
     *   5. Applies the terminal operation average.
     *   6. Returns the average as double.
     * 
     */



    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */
  

}
