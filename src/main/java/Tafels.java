import java.util.Scanner;

public class Tafels {


    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int tafelCalc = inputUser.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(tafelCalc * i);

        }
    }
}
