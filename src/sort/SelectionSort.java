package sort;

public class SelectionSort {
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMinValue = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMinValue > list[j]) {
                    currentMinValue = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMinValue;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {6, 3, 8, 4, 9, 1, -3};
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
