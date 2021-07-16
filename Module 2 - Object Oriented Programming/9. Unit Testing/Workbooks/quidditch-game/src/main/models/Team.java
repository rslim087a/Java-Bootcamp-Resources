package main.models;

public class Team {

   private static final String POSITION_CHASER = "chaser";
   private static final String POSITION_SEEKER = "seeker";
   private static final String POSITION_KEEPER = "keeper";


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
