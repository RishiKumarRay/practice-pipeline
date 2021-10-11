import java.util.Scanner;

/**
 *
 */
public final class Application {
    private Application() {
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Add");
        System.out.print("1.Sub");
        System.out.print("1.Mul");
        System.out.print("1.Div");
        int choice = sc.nextInt();
        System.out.println("enter your two numbers\n");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        final int multi = 3;
        final int max = 4;
        Calculator cal = new Calculator();
        if (choice == 1) {
            cal.add(input1, input2);
        } else if (choice == 2) {
            cal.sub(input1, input2);
        } else if (choice == multi) {
            cal.mul(input1, input2);
        } else if (choice == max) {
            cal.div(input1, input2);
        } else {
            System.out.println("Wrong Choice");
        }

    }
}
