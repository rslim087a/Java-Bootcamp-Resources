import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Alice", 85.6),
            new Student("Bob", 73.2),
            new Student("Charlie", 64.1),
            new Student("Dave", 92.7),
            new Student("Eve", 77.4),
            new Student("Frank", 59.3),
            new Student("Gina", 91.4),
            new Student("Hannah", 76.8),
            new Student("Igor", 68.9),
            new Student("Jasmine", 82.5)
        );

        students.stream()
            .filter(student -> student.getScore() > 80)
            .forEach(student -> System.out.println("Congratulations " + student.getName() + " for achieving a score of " + student.getScore()));
    }
}
