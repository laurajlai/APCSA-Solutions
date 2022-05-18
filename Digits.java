import java.util.*;

public class Digits
{
    private ArrayList<Integer> digitList;
    
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if (num == 0)
        {
            digitList.add(0);
        }
        else
        {
            while (num > 0)
            {
                digitList.add(0, num % 10);
                num = num/10;
            }
        }
    }

    public boolean isStrictlyIncreasing()
    {
        int size = digitList.size();
        for (int i = 0; i < size - 1; i++)
        {
            if (digitList.get(i).intValue() >= digitList.get(i+1).intValue())
            {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args)
    {
        Digits newnum = new Digits(12345);
        System.out.println(newnum.isStrictlyIncreasing());
    }
}