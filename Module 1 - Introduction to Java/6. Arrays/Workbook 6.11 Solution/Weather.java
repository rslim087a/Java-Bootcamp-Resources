public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        //Task 2, call celsiusToFahrenheit. 

        //Task 4, Call printTemperatures for celsius and fahrenheit.
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }


    /** Task 1
     * Function name: celciusToFahrenheit. 
     * @param celsius ( double[] )
     * @return fahrenheit ( double[] )
     * 
     * Inside the function: 
     *    1. Create an array 'fahrenheit' with the same length as 'celsius'.
     *    2. Copy all the values from celsius into the fahrenheit array.
     *    3. Update all the values in the array according to: F = (C/5 * 9) + 32.
     *    4. return the fahrenheit array.
     */   
    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i]/5 * 9)+32;
        }
        return fahrenheit;
    }

    /** Task 3
     * Function name - printTemperatures
     * @param temp ( double[] )
     * @param type ( String ) can have one of two values: Celsius or Fahrenheit
     * 
     * Inside the function:
     *   1. Uses a for loop to print the temperature values on the SAME line.
     *        Celsius: [Celsius values separated by a space]
     *        Fahrenheit: [Temperature values separated by a space]
     *   2. Adds a new line of space after printing the contents of each array.
     *   3. (Task 5) Rounds every temperature value to two decimal places. 
     */
    public static void printTemperatures(double[] temp, String type) {
        System.out.print(type + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("\n");
    }



}
