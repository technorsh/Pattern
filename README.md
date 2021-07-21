### Lab Assignment

**Pattern :**

```
* 1 2 3 4
1 * 1 2 3
1 2 * 1 2
1 2 3 * 1
```
**Code :**
```
import java.util.Scanner;

class Pattern{
    public static void main( String args[]){

        System.out.print("Enter Size of Pattern : ");

        Scanner sc = new Scanner(System.in); // Scanner - For input from the user
        int n = sc.nextInt(); 

        int counter;

        for( int i = 0; i < n; i++ ){
            counter = 1;
            for( int j = 0; j < n; j++, counter++ ){
                
                if( i == j ){     
                    System.out.print("*");
                    counter = 1;
                }

                System.out.print(counter);
                
            }
            System.out.print("\n");
        }
        
    }
}
```

**Coder :** ` Rahul Sharma ( 20234747039 ) `, ` Naveen Rohilla ( 20234747029 ) `

### ✨ Logic :

We are printing the ` * ` whenever we are getting row and column number same, then after ` * ` we are printing the number starting from ` 1 `, according to the size of the pattern. Also before ` * ` we are printing the number starting from ` 1 ` till the row and column number are not the same.

### ✨ Description :

Let n be the size of the pattern, row denoted by ` i ` and the column denoted by ` j `.

According to the pattern `( given in the question )` column is always more than ` 1 `, so according to our logic we are printing ` * ` and ` 1 ` together in a single iteration. So programmatically, you will see we are `iterating to n in both the loop`, except of having the different number of rows & columns.

We are first iterating it by rows ` i = 0 to n ( 1 row to nth row )` and whenever we are iterating, we are initialising the counter to ` 1 `.

Within the first loop we are iterating with another loop i.e., columns ` j = 0 to n ( 1 column to nth ) ` column and whenever we are encountering the condition where ` i == j `, so we are just printing ` * ` and re-initializing it to ` 1 `, so that we can begin with ` 1 ` to the remaining size of pattern after the ` * `.

So it will keep going on till we end up with a condition ` ( i >= n ) `.

### Let take an example for the pattern :

```
Size of pattern, n = 4.

i = 4
j = 4

Initially, we have i = 0 and j = 0 to n

When we are going to the loop we are initializing the counter = 1

So, when i = 0 & j = 0 , we encounter i == j condition, then we will print * and reinitialize the counter = 1
and keep printing and incrementing the counter till we reach the nth column.

After the 1st iteration,

    * 1 2 3 4

Similarly for i = 1 and j = 0 to n, we are doing the same thing.

After the 2nd iteration,

    * 1 2 3 4
    1 * 1 2 3

Finally after nth iteration, we will have our pattern, like this

    * 1 2 3 4
    1 * 1 2 3
    1 2 * 1 2
    1 2 3 * 1
    
```

### Output  :

![Screenshot of Output](output.png)
