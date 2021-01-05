import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = in.nextInt();
        }
        for (int n = 0; n < 1; n++) {
            // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
            //n - на сколько элементво сдвиг
            int buffer = intArray[0];
            intArray[0] = intArray[intArray.length - 1];

            // циклично сдвигаем весь массив
            for (int j = 1; j < intArray.length - 1; j++) {
                intArray[intArray.length - j] = intArray[intArray.length - j - 1];
            }

            // ставим буферный элемент в 1 ячейку
            intArray[1] = buffer;
        }
        for (int element : intArray) {
            System.out.print(element + " ");
        }
    }
}

