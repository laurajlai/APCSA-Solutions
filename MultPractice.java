/* StudyPractice interface */
interface StudyPractice
{
    String getProblem();
    void nextProblem();
}


public class MultPractice implements StudyPractice
{
    //fields
    private int num1;
    private int num2;

    //constructor
    public MultPractice(int x, int y)
    {
        num1 = x;
        num2 = y;
    }

    //returns problem composed of num1 and num2
    public String getProblem()
    {
        return (num1 + " TIMES " + num2);   
    }

    //retrieves the next problem by incrementing num2
    public void nextProblem()
    {
        num2++;
    }

    /* Testing in main */
    public static void main(String[] args)
    {
        //create a new MultPractice object starting at num1 = 6, num2 = 4
        MultPractice newproblem = new MultPractice(6,4);
        System.out.println(newproblem.getProblem());

        //test nextProblem() method for 2 iterations, results should be 6 TIMES 5 and 6 TIMES 6
        for(int i = 0; i < 2; i++)
        {
            newproblem.nextProblem();
            System.out.println(newproblem.getProblem());
        }
    }
}