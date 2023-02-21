public class test{
    /**
     * @param args
     */
    public static void main(String[] args){
        int[] array = {5,3,1,4,2};
        //selectionSort(array);
        insertionSort(array);
        for (int i:array){
            System.out.print(i+" ");
        }
    }
    
    /**
     * @param array
     */
    private static void insertionSort(int[] array) {
        for (int i = 1 ; i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            
            while(j>=0 && array[j]>temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    /**
     * @param array
     */
    private static void selectionSort(int[] array) {
        for (int i = 0 ; i<array.length-1;i++){
            int min = i;
            for (int j = i+1; j<array.length;j++){
                if (array[min]>array[j]){
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }


}