public class Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j <= i; j++) {
              if (j == i) {
                System.out.print(" * ");
              } else {
                System.out.print("   ");
              }
          }
          System.out.println();
        }
    }
}
