public class Immutable {
    public static void main(String[] args) {        

        int apples = 5;
        Integer applesWrapper = 5;

        System.out.println(apples);
        System.out.println(applesWrapper);

        long stars = 1_000_000_000_000L;
        Long starsWrapper = 1_000_000_000_000L;

        System.out.println(stars);
        System.out.println(starsWrapper);

        double decimal = 1.25;
        Double decimalWrapper = 1.25;

        System.out.println(decimal);
        System.out.println(decimalWrapper);

        boolean bool = true;
        Boolean boolWrapper = true;

        System.out.println(bool);
        System.out.println(boolWrapper);

        char letter = 'a';
        Character letterWrapper = 'a';

        System.out.println(letter);
        System.out.println(letterWrapper);

    }
}