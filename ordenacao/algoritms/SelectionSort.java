package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();

        for (int i=0; i<sorted.length; i++) {
            for (int j = i+1; j<sorted.length; j++) {
                if (sorted[j] < sorted[i]) {
                    int aux = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = aux;
                }
            }
        }
        
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
