# JavaSorting

Note to self: This repo is saved as the directory "LSE/Term 1/MA407 Algorithms & Computation/Week 4/MyCode_Week4"

## Insertion Sort
Input: a<sub>1</sub>, ... , a<sub>n</sub>  
Output: b<sub>1</sub>, ... , b<sub>n</sub> (the a<sub>i</sub>'s in increasing order)  

An iteration of Insertion Sort:  
On the j<sup>th</sup> iteration, we have the sequence c<sub>1</sub>,...,c<sub>j</sub>, a<sub>j+1</sub>,...,a<sub>n</sub>.  
Here c<sub>1</sub>,...,c<sub>j</sub> is the numbers a<sub>1</sub>,...,a<sub>j</sub> in increasing order.  
1. Compare a<sub>j+1</sub> with c<sub>j</sub>,c<sub>j-1</sub>,c<sub>j-2</sub>,... in this order until a place is found, ie when c<sub>i</sub> < a<sub>j+1</sub> <= c<sub>i+1</sub>.  
2. Insert a<sub>j+1</sub> between c<sub>i</sub> and c<sub>i+1</sub>.  
