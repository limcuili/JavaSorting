# JavaSorting

Note to self: This repo is saved as the directory "LSE/Term 1/MA407 Algorithms & Computation/Week 4/MyCode_Week4"

## Insertion Sort
Input: a<sub>1</sub>, ... , a<sub>n</sub>  
Output: b<sub>1</sub>, ... , b<sub>n</sub> (the a<sub>i</sub>'s in increasing order)  

An iteration of Insertion Sort:  
On the j<sup>th</sup> iteration, we have the sequence c<sub>1</sub>,...,c<sub>j</sub>, a<sub>j+1</sub>,...,a<sub>n</sub>.  
Here c<sub>1</sub>,...,c<sub>j</sub> is the numbers a<sub>1</sub>,...,a<sub>j</sub> in increasing order.  
1. Compare a<sub>j+1</sub> with c<sub>j</sub>,c<sub>j-1</sub>,c<sub>j-2</sub>,... in this order until a place is found, ie when c<sub>i</sub> < a<sub>j+1</sub> <= c<sub>i+1</sub> (or a<sub>j+1</sub> < c<sub>1</sub>).  
2. Insert a<sub>j+1</sub> between c<sub>i</sub> and c<sub>i+1</sub> (or at the beginning of the list).  
3. Repeat next iteration with this new c<sub>1</sub>,...,c<sub>j+1</sub>, a<sub>j+2</sub>,...,a<sub>n</sub>.  

Worst case running time: O(n<sup>2</sup>)  
Running time for ordered list: O(n)  
Running time for reversed list: O(n<sup>2</sup>)  
Extra memory required: O(1)

## Merge Sort
Input: a<sub>1</sub>, ... , a<sub>n</sub>  
Output: b<sub>1</sub>, ... , b<sub>n</sub> (the a<sub>i</sub>'s in increasing order)  

1. When n = 1, we are done.  
2. For n > 1, set k = floor(n/2) and recursively sort the two sequences a<sub>1</sub>,...,a<sub>k</sub> and a<sub>k+1</sub>,...,a<sub>n</sub>.  
3. Merge the two sorted sequences.  

Let us see how step 3 is carried out. Suppose we want to merge two sorted sequences b<sub>1</sub>,...,b<sub>k</sub> and c<sub>1</sub>,...,c<sub>l</sub>. The first element of the merged sequence is going to be min{b<sub>1</sub>,c<sub>1</sub>}. Delete this minimal element from its respective sequence and place it at the first position of the merged sequence. To find the second element of the merged sequence, compare the first elements of the two new sequences, etc. If all elements of one sequence has been deleted, then the remains of the other sequence is appended at the end of the existing merged sequence, and we are done.

Worst case running time: O(nlogn)  
Running time for ordered list: O(nlogn)  
Running time for reversed list: O(nlogn)  
Extra memory required: O(n)  

## Quick Sort
Input: a<sub>1</sub>, ... , a<sub>n</sub>  
Output: b<sub>1</sub>, ... , b<sub>n</sub> (the a<sub>i</sub>'s in increasing order)  

1. Pick some element a<sub>k</sub> from the input and call it the pivot.  
2. Reorder the list such that for all i = 1,.., k-1, k+1,..., n:
      i. all elements a<sub>i</sub> < a<sub>k</sub> come before the pivot.  
      ii. all elements a<sub>i</sub> > a<sub>k</sub> come after the pivot.  
3. Recursively sort the elements on either side of the pivot.  

