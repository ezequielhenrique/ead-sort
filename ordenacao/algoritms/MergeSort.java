package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        
        mergeSort(sorted, 0, sorted.length);

        return sorted;
    }

    private void mergeSort(int[] array, int start, int end) {
        if (end - start > 1) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid, end);

            merge(array, start, mid, end);
        }
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] newArray = new int[end - start];
        
        int pos = 0;
        int i = start;
        int m = mid;

        while (i < mid && m < end) {
            if (array[i] <= array[m]) {
                newArray[pos] = array[i];
                pos++;
                i++;
            } else {
                newArray[pos] = array[m];
                pos++;
                m++;
            }
        }

        while (i < mid) {
            newArray[pos] = array[i];
            pos++;
            i++;
        }

        while (m < end) {
            newArray[pos] = array[m];
            pos++;
            m++;
        }

        for(pos = 0, i = start; i < end; i++, pos++) {
            array[i] = newArray[pos];
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
