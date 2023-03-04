import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int masCount = 10000;
        int rand = 1500;
        int[] mas = new int[masCount];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(rand + 1);
        }

        System.out.println("array: ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        int temp;
        int outSide = 0;
        boolean isSorted = false;

        do {
            isSorted = true;
            for (int i = 0; i < mas.length - 1 - outSide; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;

                    isSorted = false;
                }
            }
            outSide += 1;
        } while (isSorted == false);

        System.out.println();
        System.out.println("Sorted array: ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        int searchValue = 5;
        int foundIndex = -1;
        int search = 0;

        int leftIndex = 0;
        int rightIndex = mas.length - 1;

        while (rightIndex - leftIndex > 1) {

            int i = (leftIndex + rightIndex) / 2;

            if (mas[i] == searchValue) {
                foundIndex = i;
                break;
            }

            if (searchValue > mas[i]) {
                leftIndex = i;
            } else if (searchValue < mas[i]) {
                rightIndex = i;
            }
            search += 1;
        }

        System.out.println("Search = " + search);

        if (foundIndex == -1) {
            System.out.println("Not found number ");
        } else {
            System.out.println("Value = " + searchValue + " Index = " + foundIndex);
        }
    }
}