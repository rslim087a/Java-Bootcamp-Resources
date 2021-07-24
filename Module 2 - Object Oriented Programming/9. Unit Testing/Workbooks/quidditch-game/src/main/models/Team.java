package src.main.models;

public class Team {

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

//Question: the constants are final, so why can't we make them public? It's not possible for the caller to update them.
//Answer: It's good practice to expose a method and not the variable, even if the constant is final. 
    
     public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

}
