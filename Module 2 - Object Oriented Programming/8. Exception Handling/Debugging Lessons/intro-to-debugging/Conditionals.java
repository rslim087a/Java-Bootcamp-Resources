public class Conditionals {
    public static void main(String[] args) {
        String option = "";

        int random = (int) Math.random() * 1 + 3;
        
        switch (random) {
            case 1: option = "hit"; 
            case 2: option = "stay";
            case 3: option = "fold";
            default: option = "This should never get called";
        }
     

        if (!option.equals("hit") || !option.equals("stay")) {
            System.out.println("fold");
        } else {
            System.out.println(option); 
       } 
    }
}
