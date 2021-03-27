public class Beer {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            sing(i);
        }
    }

    /**
     * Function name – sing.
     * @param i (int)
     * 
     * 
     * Inside the function: 
     *  1. print:
     *      <X> bottles of beer on the wall, X bottles of beer!
     *      take one down, pass it around <X-1>, bottles of beer on the wall!
     */

    public static void sing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("take one down, pass it around, " + (i-1) + " bottles of beer on the wall!"); 
 
    }
}
