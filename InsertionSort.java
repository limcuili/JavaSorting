// compile with 'javac InsertionSort.java'
// run with 'java InsertionSort'

class InsertionSort {

    static void printArray (int[] x) {
        for (int i=0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    static void insertionSort (int[] x) {
        for (int i = 1; i < x.length; i++) {
            int key = x[i];
            int j = i;
            while (j>0 && key < x[j-1]) {
                x[j] = x[j-1];
                j--;
            }
            x[j] = key;
        }
        printArray(x);
    }

    public static void main (String args[]) {
        // Test 1
        int[] a = {3, 16, 2, 5, 1, 20};
        System.out.print("The array is : ");
        printArray(a);
        System.out.println();
        System.out.print("The sorted array is : ");
        insertionSort(a);
        System.out.println("    Test 1 Completed.");

        // Test 2
        int[] b = {1,2,5,20,33,3,7,9,11,15};
        System.out.print("The array is : ");
        printArray(b);
        System.out.println();
        System.out.print("The sorted array is : ");
        insertionSort(b);
        System.out.println();
    }

}