import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StudentDetails student = new StudentDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there, what's your name? \n");
        String name = scanner.nextLine();
        student.setFullName(name);

        System.out.println("It's me again, what's your department \n");
        String department = scanner.nextLine();
        student.setDepartment(department);

        System.out.println("Hiii, How old are you? \n");
        int age = scanner.nextInt();
        student.setAge(age);

        System.out.println("Hellooo, what level are you? \n");
        int level = scanner.nextInt();
        student.setLevel(level);

        System.out.println("Sorry again, what's your weight? \n");
        int weight = scanner.nextInt();
        student.setWeight(weight);




        System.out.println("Your name is " +student.getFullName());
        System.out.println("Your department is " +student.getDepartment());
        System.out.println("You're " +student.getAge() +"years old");
        System.out.println("You're in " +student.getLevel() + "level");
        System.out.println("You're " +student.getWeight() +"KG in weight");




        }

}