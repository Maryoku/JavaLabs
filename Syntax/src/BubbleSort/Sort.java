package BubbleSort;

public class Sort {

    public static void main(String[] args) {
        int arr[] = {8, 11, 4, 0, 5};
        bubbleSort bs = new bubbleSort();
        bs.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class bubbleSort {
    public void sort (int[] arr) {
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr [j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
