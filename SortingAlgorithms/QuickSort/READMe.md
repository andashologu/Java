# software-engineering
[8, 2, 4, 7, 1, 3, 9, 6, 5]
Step 1
Pass array as argument to quicksort function
Step 2
Pick a pivot
There are different variations of picking a pivot.
We can either pick a pivot in the beginning or in  the middle or at the end
Most standard quick sort algorithms set the pivot at the end of the array
What we are trying to accomplish is to find the resting place of the  pivot
To find the resting value of the pivot 
    step 1 declare variable and use two indeces, j and i
            j will begin at the start of array and i will be one less than the beginning of the array
          i  j                       pivot
            [8, 2, 4, 7, 1, 3, 9, 6, 5]
    step 2 we need a helper of a temporary variable we can use to swap values
          i  j                       p(pivot)
            [8, 2, 4, 7, 1, 3, 9, 6, 5]
                temp = ?
    step 3 we must compare the value at j with value at p (or pivot). If j equals p or is greater than p we leave it and then increment j
         i      j                    p
            [8, 2, 4, 7, 1, 3, 9, 6, 5]
                temp = ?
    step 4 incement i (if you notice on the prevoius step i didnt take play yet.)
             i  j                    p
            [8, 2, 4, 7, 1, 3, 9, 6, 5]
                temp = ?
    step 5 repeat step 3. in this case j is less than pivot so we swap j and i with help of pivot
             i  j                    p
            [?, 2, 4, 7, 1, 3, 9, 6, 5]
                temp = 8
.....to be continued