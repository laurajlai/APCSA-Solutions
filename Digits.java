import java.util.*; //import ArrayList class

public class Digits
{
    private ArrayList<Integer> digitList;
    
    /* Constructor for Digits class */
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>(); //initialize digitList

        if (num == 0) // special case when num is equal to 0, in which case we just add 0 to digitList
        {
            digitList.add(0);
        }
        else
        {
            while (num > 0)
            {
                digitList.add(0, num % 10); // num % 10 gives the last digit of a number
                num = num/10; // num / 10 removes the last digit of a number (note that we are using integer division) 
            }
        }
    }

    /* isStrictlyIncreasing function */
    public boolean isStrictlyIncreasing()
    {
        int size = digitList.size(); 

        //loop through the ArrayList containing the digits
        for (int i = 0; i < size - 1; i++)
        {
            if (digitList.get(i)/*.intValue()*/ >= digitList.get(i+1)/*.intValue()*/) //intValue() is no longer necessary due to autoboxing, so it's commented out 
            {
                return false;
            }
        }
        return true;
    }

    /* Testing in main */
    public static void main (String[] args) 
    {
        Digits newnum = new Digits(12345);
        System.out.println("input: 12345. expected output: true. actual: " + newnum.isStrictlyIncreasing());

        Digits newnum1 = new Digits(54321);
        System.out.println("input: 54321. expected output: false. actual: " + newnum1.isStrictlyIncreasing());
    }
}