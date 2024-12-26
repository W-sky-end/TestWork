import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter the name students(if enough enter \"Stop\"): ");

        while (true){
            String name = sc.next();
            if (name.equalsIgnoreCase("Stop")){
                break;
            }
            students.add(name);
        }
        sc.close();
        System.out.println(students);

        students.remove(1);

        System.out.println(students);

        students.add("Vadim");

        System.out.println(students);

    }
}
