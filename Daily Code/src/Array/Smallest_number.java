package Array;

public class Smallest_number {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 25, 47, 12, 3, 54, 87};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
