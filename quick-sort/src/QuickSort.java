public class QuickSort {

    public void sort(int[] array, int start, int end){
        if( end <= start) return;
        int i = start -1;
        int pivot = array[end];

        for(int j = start; j <= end; j++){
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, end);

        sort(array, start, i-1);
        sort(array, i+1, end);


    }

    public void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
