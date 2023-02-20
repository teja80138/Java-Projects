public class test{
    public static void main(String[] args){
        int[] array = {5,3,1,4,2};
        selectionSort(array);
        for (int i:array){
            System.out.print(i+" ");
        }
    }

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