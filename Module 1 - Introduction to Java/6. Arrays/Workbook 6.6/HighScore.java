public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    
        int highScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        
       
        System.out.println(" - After obtaining the highest score, print: The highest score is:  " + highScore + ". Impressive!");
        
        // TODO : See instructions on Learn the Part (Workbook 6.6)
        System.out.println(" - It's the gentleman in seat: <index>. Give that man a cookie!");

    }
    
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
