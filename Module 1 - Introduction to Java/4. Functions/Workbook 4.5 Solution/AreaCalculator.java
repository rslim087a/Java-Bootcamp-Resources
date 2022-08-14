public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");
        
        //Task 5 – Call area functions.

        double square = areaSquare(2);
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);
        
        //Task 7 - Print the areas
        printAreas(square, rectangle, triangle, circle);
    }


    //Task 1 - Write a function that calculates the area of a square. 

    /**
     * Function name: areaSquare - returns the area of a square.
     * @param side (double)
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the side is negative, print "Error: impossible" and terminate the java program.
     *  2. Calculate the area of the square. A = side²
     */

    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }
        return Math.pow(side, 2);
    }


    //Task 2 - Write a function that calculates the area of a rectangle. 

    /**
     * Function name: areaRectangle – returns the area of a rectangle.
     * @param length (double).
     * @param width  (double).
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the length OR width is negative, print "Error: impossible" and terminate the program.
     *  2. Calculate the area of the rectangle. A = length * width
     */
    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }
        return length * width;
    } 


    //Task 3 - Write a function that calculates the area of a triangle. 

    /**
     * Function name: areaTriangle – it returns the area of a triangle.
     * @param base: (double).
     * @param height: (double).
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the base OR height is negative, print "Error: impossible" and terminate the program.
     *  2. Calculate the area of the triangle. A = base * height / 2
     */ 

    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }

        return (base*height)/2;
    }


    //Task 4 - Write a function that calculates the area of circle. 

    /**
     * Function name: areaCircle – it returns the area of a circle.
     * @param radius (double).
     * @return area (double)
     * 
     * Inside the function: 
     *  1. If the radius is negative, terminates the program.
     *  2. Calculates the area of the circle. 
     */ 

    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }
        return Math.PI*Math.pow(radius, 2);
    }

    //Task 6: Write a function that prints every area.


    /**
     * Function name: printAreas – it prints four areas
     * @param square – square area (double)
     * @param rectangle – rectangle area (double)
     * @param triangle – triangle area (double)
     * @param circle – circle area (double)
     * 
     * Inside the function:
     *  1. print: ("Square area: <square area>")
     *  2. print: ("Rectangle area: <rectangle area>")
     *  3. print: ("Triangle area: <triangle area>")
     *  4. print: ("Circle area: <circle area>")
     * 
     */

    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }

}
