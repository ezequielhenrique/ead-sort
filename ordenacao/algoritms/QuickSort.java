package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();

        quickSort(sorted, 0, sorted.length-1);
        
        return sorted;
    }

    private void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivoPos = partition(array, start, end);
            quickSort(array, start, pivoPos-1);
            quickSort(array, pivoPos+1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivo = array[end];
        int i = start;

        for (int j=start; j<end; j++) {
            if (array[j] <= pivo) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;

                i++;
            }
        }
        int aux = array[i];
        array[i] = array[end];
        array[end] = aux;

        return i;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

}
