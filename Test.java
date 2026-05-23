import java.util.Scanner
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = input.nextDouble(); 

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 80) {
            System.out.println("Excellent");
        } else if (score >= 60) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}
