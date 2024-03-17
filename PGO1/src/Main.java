import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            System.out.println("Podaj liczbę");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x > 0) {
                System.out.println("Liczba dodatnia");
            } else if (x < 0) {
                System.out.println("Liczba ujemna");
            } else if (x == 0) {
                System.out.println("Liczba równa 0");
            }
        }
    }






