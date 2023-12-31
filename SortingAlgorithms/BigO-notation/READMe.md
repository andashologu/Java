# Big O Notation

reference: https://youtu.be/D6xkbGLQesk

How much does it take to run a function.
How does the runtime of this function grow.
Big O Notation and Time Complexity.

Time complexity: the way of showing how the runtime of a function increases as the size of the input increases.
-	Linear time		O(n)
-	Constant time		O(1)
-	Quadratic time		O(n^2)

How to know if a function of a graph has which time complexity?

I.	Example 1: what is the time complexity of T expressed as linear function, T = a(n) + b where n represents number of elements in an array and a and b are two constants.

Step 1 find the fastest growing term, a(n) in case of this example.
Step 2 take out the coefficient, in this case it’s a because a is a constant. The result will be ‘n’.

And so we have O(n) which simplifies that the time complexity for T = a(n) + b = O(n)

II.	Example 2: what is the time complexity of T expressed as linear function, T = cn^2 + dn + e where n represents number of elements in an array and c, d and e are two constants.

Step 1 find the fastest growing term, cn^2 in case of this example.
Step 2 take out the coefficient, in this case it’s c because a is a constant. The result will be ‘n^2’.

And so we have O(n) which simplifies that the time complexity for T = a(n) + b = O(n)

III. example 3: 
    given_array = [1, 4, 3, 3, ..., 10]

    int stupid_function(int[] given_array){
        int total = 0 ;-> O(1)
        return total; -> O(1)
    }

    T = O(1) + O(1) = c1 + c2 = c3 = c3 x 1 = O(1)
    So O(1) + O(1) = O(1)

III. example 4: 

    int stupid_function(int[] given_array){
        int total = 0; -> O(1)
-> O(1) for(int i = 0; i < given_array.length ; i++){ 
            total += i; -> O(1)
        }
        return total; O(1)
    }

    T = O(1) + nxO(1) + O(1) = c4 + n x c5 = O(n)
    nxO(1) simplifies that the for loop is executred for the number of size of array.

    Step 1 find the fastest growing term, nxO(1) in case of this example.
    Step 2 take out the coefficient, in this case it’s O(1) because a is a constant. The result will be ‘n’.

IV. example 5:

    int[][] aray_2d = {{1, 4, 3}, 
                    {3, 1, 9},
                    {0, 5, 2}};
            OR
    int[][] aray_2d = {{1, 4, 3, 1}, 
                    {3, 1, 9, 4},
                    {0, 5, 2, 6},
                    {4, 5, 7, 8}};

    int[][] find_sum_2d(int[][] array_2d){
        total = 0; -> O(1)
        for(int i = 0; i < given_array.length ; i++){
            row = given_array[i];
            for(int j = 0; j < row.length ; j++){
                total += j; -> O(1)
            }
        }
            return total; -> O(1)
        return 
    }

    T = O1 + n^2 x O(1) + O(1) = c6 + n^2 + c7 = On^2
    n^2 x O(1) simplifies that there are two for loops executred for the number of array size.

    Step 1 find the fastest growing term, n^2xO(1) in case of this example.
    Step 2 take out the coefficient, in this case it’s O(1) because a is a constant. The result will be ‘n^2’.

IV. example 5:

    int[][] aray_2d = {{1, 4, 3}, 
                    {3, 1, 9},
                    {0, 5, 2}};
            OR
    int[][] aray_2d = {{1, 4, 3, 1}, 
                    {3, 1, 9, 4},
                    {0, 5, 2, 6},
                    {4, 5, 7, 8}};

    int[][] find_sum_2d(int[][] array_2d){
        total = 0; -> O(1)
        for(int i = 0; i < given_array.length ; i++){
            row = given_array[i];
            for(int j = 0; j < row.length ; j++){
                total += j; -> O(1)
            }
        }
        for(int i = 0; i < given_array.length ; i++){
            row = given_array[i];
            for(int j = 0; j < row.length ; j++){
                total += j; -> O(1)
            }
        }
            return total; -> O(1)
        return 
    }

    T = 2n^2 x c_1 + ...=2n^2 x c_1 + c_2 x n + c_3
        = 2(c_1) x n^2 + c_2 + c_3 = O(n^2)
    So T = O(2n^2) = O(n^2)


