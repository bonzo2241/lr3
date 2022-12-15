import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lenghtarray;
        System.out.print(Введите размерность массива );
        lenghtarray = in.nextInt();
        int[] a = new int[lenghtarray];
        for (int i = 0; i  lenghtarray; i++) {
            System.out.print(Введите элемент );
            a[i] = in.nextInt();
        }
        int b;
        System.out.print(Введите число для удаления );
        b = in.nextInt();
        System.out.print(Исходный массив );
             for (int elem  a) {
                System.out.print(elem +  );
            }
        System.out.println();
        System.out.print(Массив после обработки );
            for (int elem  a) {
                if (elem != b) {
                    System.out.print(elem +  );
                }
            }
        }
}

