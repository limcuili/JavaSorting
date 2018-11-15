class MergeSort {

    static void printArray (int[] x) {
        for (int i=0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    // merges two sorted sequences x[start],...,x[middle - 1] and x[middle],...,x[end]
    static void merge(int[] x, int start, int middle, int end) {
        int[] left = new int[middle-start];
        for (int i = start; i < middle; i++) { // copy first half to the left
            left[i - start] = x[i];
        }
        int iLeft = 0;
        int iRight = middle;
        for (int i=start; i < end; i++){
            if (iRight >= end || left[iLeft] <= x[iRight]) {
                x[i] = left[iLeft];
                iLeft++;
                if (iLeft >= left.length) {
                    break;
                } else {
                    x[i] = x[iRight];
                    iRight++;
                }
            }
        }
    }

    // recursively sort the elements x[start], s[start + 1],..., x[end - 1]
    static void mergeSort(int[] x, int start, int end) {
        if (start < end - 1) {
            int middle = (start+end)/2;  // recall that Java automatically floors a non-integer if it expects an int
            mergeSort(x, start, middle);
            mergeSort(x, middle, end);
            merge(x,start,middle,end);
        }
    }

    public static void main (String args[]) {
        // Test 1
        int[] a = {3, 16, 2, 5, 1, 20};
        System.out.print("The array is : ");
        printArray(a);
        System.out.println();
        System.out.print("The sorted array is : ");
        mergeSort(a,0, a.length);
        System.out.println("    Test 1 Completed.");

        // Test 2
        int[] b = {1,2,5,20,33,3,7,9,11,15};
        System.out.print("The array is : ");
        printArray(b);
        System.out.println();
        System.out.print("The sorted array is : ");
        mergeSort(b,0, b.length);
        System.out.println();
    }

}