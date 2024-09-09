public class Main {
    public static void main(String[] args) {
        int[] array = {9, 5, 8, 8, 4, 7, 1, 3, 6, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println("Posição " + i + ": " + array[i]);
            }
        }
    }
}
