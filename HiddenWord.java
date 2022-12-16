public class HiddenWord
{
    //fields
    private String word; //the word to be guessed

    //constructor
    public HiddenWord(String hWord)
    {
        word = hWord; 
    }

    //getHint() method
    public String getHint(String guess)
    {
        //create new String for result
        String result = "";

        //look through guess string
        for (int i = 0; i < guess.length(); i++)
        {
            //save the current letter (can also save word.substring(i, i+1))
            char c = guess.charAt(i);

            //if the current letter is at the same position in the hidden word, add the character to result
            if (c == word.charAt(i))
            {
                result += c;
            }
            //if the current letter is in the hidden word but not at that position, add '+'
            else if (word.indexOf(c) != -1) 
            {
                result += "+";
            }
            //otherwise, the letter was not there, add '*'
            else
            {
                result += "*";
            }
        }
        return result;
    }

    /* Testing in main using example */
    public static void main (String[] args)
    {
        HiddenWord newword = new HiddenWord("HARPS");
        System.out.println(newword.getHint("AAAAA"));
        System.out.println(newword.getHint("HELLO"));
        System.out.println(newword.getHint("HEART"));
        System.out.println(newword.getHint("HARMS"));
        System.out.println(newword.getHint("HARPS"));
    }
}