// compile with 'javac MergeSort.java'
// run with 'java MergeSort'

class MergeSort {

    static void printArray (int[] x) {
        for (int i=0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    // merges two sorted sequences x[start],...,x[middle - 1] and x[middle],...,x[end]
    static void merge(int[] x, int start, int middle, int end) {
        int[] left = new int[middle-start];
        int[] right = new int[end-middle];
        // copy the first half to left array, the second half to right array
        for (int i=start; i < middle; i++) {
            left[i-start] = x[i];
        }
        for (int i=middle; i < end; i++) {
            right[i-middle] = x[i];
        }

        int iLeft = 0;  // index of left array
        int iRight = 0; // index of right array

        for (int i=start; i<end ; i++) {
            if (iLeft >= left.length) {
                x[i] = right[iRight];
                iRight++;
            } else if (iRight >= right.length) {
                x[i] = left[iLeft];
                iLeft++;
            } else if ( left[iLeft] <= right[iRight] ) {
                x[i] = left[iLeft];
                iLeft++;
            } else {
                x[i] = right[iRight];
                iRight++;
            }
        }
        System.out.println();
        printArray(x);
    }

    // recursively sort the elements x[start], x[start + 1],..., x[end - 1]
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
        System.out.print("The input array is : ");
        printArray(a);
        System.out.println();
        System.out.println("The steps to sorted sequence is: ");
        mergeSort(a,0, a.length);
        System.out.println();
        System.out.println();

        // Test 2
        int[] b = {1,2,5,20,33,3,7,9,11,15};
        System.out.print("The input array is : ");
        printArray(b);
        System.out.println();
        System.out.println("The steps to sorted sequence is: ");
        mergeSort(b,0, b.length);
        System.out.println();
    }

}