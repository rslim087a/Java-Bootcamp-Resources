public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        
        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }



    //Task 1: Make a function here. See the green docs below. 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     *  1. return the temperature in celcius. C = (F - 32) * 5/9. 
     */

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    //Task 2: Make a function here. See the green docs below. 

    /**
     * Name: printTemperatures – it prints a temperature in fahrenheit and celsius. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints the fahrenheit value: "F: <temperature in fahrenheit>".
     *  2. calls fahrenheitToCelsius, and prints the celcius value: "C: <temperature in celsius> \n".
     */
    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) +"\n");
    }
}