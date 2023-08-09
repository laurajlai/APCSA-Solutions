public class DiverseArray
{
    /*This method sums all of the elements in the input array arr using a for loop.
    The resulting sum is returned.
    */
    public static int arraySum(int[] arr)
    {
        //set up sum variable
        int sum = 0;

        //loop through arr adding to sum
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    /* This method sums all of the rows in the input 2-D array arr2D using a for loop and
    the previous arraySum method.
    The resulting sums are stored in a 1-D array, which the function will return.  
    */
    public static int[] rowSums(int[][] arr2D)
    {
        //create variable to represent the number of rows
        int numrows = arr2D.length;

        //create 1-D array to store sums
        int [] sums = new int[numrows];

        //find the sum of each row of arr2D using arraySum
        for (int i = 0; i < numrows; i++)
        {
            sums[i] = arraySum(arr2D[i]);
        }

        return sums;
    }

    /* This method determines whether or not arr2D is a diverse array, returning true if
    it is and false if it isn't. 
    */
    public static boolean isDiverse(int[][] arr2D)
    {
        //set sums array equal to the row sums of arr2D
        int[] sums = rowSums(arr2D);

        //loop through sums using 2 for loops to compare all values with each other
        for (int i = 0; i < sums.length; i++)
        {
            for (int j = i + 1; j < sums.length; j++)
            {
                //if two values are equivalent, return false
                if (sums[i] == sums[j])
                {
                    return false;
                }
            }
        }

        //otherwise, return true
        return true;
    }
}