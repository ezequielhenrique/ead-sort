package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();

        for (int i=1; i<sorted.length; i++) {
            int j = i;

            while (j > 0 && sorted[j-1] > sorted[j]) {
                int aux = sorted[j-1];
                sorted[j-1] = sorted[j];
                sorted[j] = aux;

                j--;
            }
        }

        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
