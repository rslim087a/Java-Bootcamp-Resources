import java.util.Scanner;

public class Main {

    public static boolean isNullOrBlank(String input) {
        return input == null || input.isBlank();
    }

    public static boolean incorrectPopulation(int population) {
        return population <= 0;
    }

    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            if (!isNullOrBlank(cityName)) {
                return cityName;
            }
        }
    }

    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String country = scanner.nextLine();
            if (!isNullOrBlank(country)) {
                return country;
            }
        }
    }

    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int population = scanner.nextInt();
            if (!incorrectPopulation(population)) {
                return population;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);

        String country = promptForCountry(scanner);

        int population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);

        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.addCity(newCity);

        System.out.println("City added to the tracker: " + newCity.getName());
    }
}
