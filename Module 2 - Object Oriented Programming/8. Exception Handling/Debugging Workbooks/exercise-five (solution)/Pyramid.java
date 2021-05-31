public class Pyramid {
    public static void main(String[] args) {
        char letter = 'a';
            
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print("\n");
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + letter + " ");
                }
            }
            letter++;
            System.out.print("\n");
        }
    }
}
