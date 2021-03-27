public class Exams {
    public static void main(String[] args) {
        
        String[] seats = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + ", you will take seat " + i);
        }
    }
}