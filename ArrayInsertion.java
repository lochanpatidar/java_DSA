public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int pos = 2;
        int value = 99;

        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
