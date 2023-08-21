public class NumberCube 
{
    //toss method that returns a number between 1 and 6 using Math.random
    public int toss() 
    {
        return (int) ((Math.random() * 6) + 1);
    }

    //return numtosses amount of throws
    public static int[] getCubeTosses(NumberCube cube, int numtosses) 
    {
        //create new array
        int[] tossresults = new int[numtosses];

        //loop through new array, setting each entry equal to the result of toss()
        for (int i = 0; i < tossresults.length; i++) 
        {
            tossresults[i] = cube.toss();
        }

        //return the resulting array
        return tossresults;
    }

    //gets the longest consecutive run of a single value in the array values
    public static int getLongestRun(int[] values) 
    {
        //set up variables
        int maxStart = -1;
        int maxLen = -1;
        int currentLen = 0;
        int currVal = -1;
        int currStart = 0;

        //loop through values array
        for (int i = 0; i < values.length; i++) 
        {
            //if the values are equal, currentLen goes up
            if (values[i] == currVal)
            {
                currentLen++;
            }
            //if the values are equal, compare currentLen to maxLen and update if applicable
            else 
            {
                if (currentLen > maxLen) 
                {
                    maxLen = currentLen;
                    maxStart = currStart;
                }
                currStart = i;
                currentLen = 1;
                currVal = values[i];
            }
        }

        //final check at the end
        if (currentLen > maxLen) 
        {
            maxLen = currentLen;
            maxStart = currStart;
        }
        
        //if maxLen is 1, that means that there were no consecutive numbers
        if (maxLen == 1)
        {
            return -1;
        }
        //if maxLen is not 1, that means there is a valid consecutive list of numbers
        else
        {
            return maxStart;
        }
    }

    //testing methods
    public static void main(String[] args) 
    {
        int[] nums0 = { 2, 3, 1, 2 };
        int[] nums1 = { 2, 2, 2, 3, 1, 1, 2 };
        int[] nums2 = { 2, 3, 3, 1, 4, 4, 4, 2 }; 

        System.out.println("Longest run =" + getLongestRun(nums0));
        System.out.println("Longest run =" + getLongestRun(nums1));
        System.out.println("Longest run =" + getLongestRun(nums2));
    }
}