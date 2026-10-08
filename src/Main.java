import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] mas = inputMas();
        // randomize(mas);
        kvadratMas(mas);
        printMas(mas);
        reversMas(mas);
        printMas(mas);
    }

    private static int[] inputMas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scan.nextInt();
        int[] mas = new int[x];
        return mas;
    }

    public static void randomize(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            Random rn = new Random();
            int randomNum = rn.nextInt(10);
            mas[i] = randomNum;
        }
        System.out.println(Arrays.toString(mas));
    }

    public static int[] kvadratMas(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (i + 1) * (i + 1);
        }
        return mas;
    }

    public static int[] reversMas(int[] mas) {
        int[] masR = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            masR[i] = mas[mas.length - i - 1];
        }
        return masR;
    }


    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas));

        }

    }

    }