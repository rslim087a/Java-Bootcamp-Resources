public class Championship {
    public static void main(String[] args) {

        int gryffindor = 100;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        int pointsMargin = gryffindor-ravenclaw;
        
        if (pointsMargin >= 300) {
            System.out.println("Gryffindor are the champions");
        } else if (pointsMargin >= 0) {
            System.out.println("Gryffindor is in second place");
        } else if (pointsMargin >= -100) {
            System.out.println("Gryffindor is in third place");
        } else {
            System.out.println("Gryffindor is in fourth place");
        }
    }
}