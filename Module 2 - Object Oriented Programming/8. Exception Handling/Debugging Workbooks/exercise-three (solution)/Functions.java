public class Functions {
    public static void main(String[] args) {
        int random = random(15);    
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + (random == 1 ? "NEITHER" : isPrime(random)));
    }

    public static int random(int range) {
        double random = Math.random() * range + 1;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "PRIME";
        for (int i = 2; i < random; i++) {
            if (random % i == 0) {
                isPrime = "COMPOSITE";
                break;
            }
        }
        return isPrime;
    }
}
