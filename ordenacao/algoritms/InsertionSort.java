package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();

        int aux;
        int j;
        
        for (int i=1; i < elements.length; i++) {
           aux = elements[i];
           j = i-1;

           while(j>= 0 && elements[j] > aux) {
            elements[j+1] = elements[j];
            j--;
           }

           elements[j+1] = aux;
        }

        return elements;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
