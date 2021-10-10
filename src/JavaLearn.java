import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaLearn {

    public static void main(String[] args) {
        loop();
    }

    public static void reNhanh() {
        boolean test = true;
        if (test) {

        } else if (test = Boolean.parseBoolean(null)) {

        } else {

        }
        int a = 5;
        switch (a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println(a);
                break;
            default:
        }
        int c = a == 4 ? 4 : test ? 3 : 1;
        System.out.println(c);
    }

    public static void loop() {
        int a = 4;
        while (a != 0) {
            System.out.println(a--);
        }
        int b;
        boolean condition;
        do {
            b = inputInt(
                    "Nhap vao mot so nguyen: ",
                    "Hay nhap mot so nguyen."
            );
            condition = b < 10;
            if (condition) {
                System.out.println("Hay nhap so > 10.");
            }
        } while (condition);
        System.out.println(b);
    }

    private static final Scanner sc = new Scanner(System.in);

    private static int inputInt(String label, String errorLabel) {
        while (true) {
            try {
                System.out.print(label);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorLabel);
            }
        }
    }
}