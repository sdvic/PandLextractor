import java.util.Random;

/**
 * Created by VicMini on 7/22/15.
 */
public class Person
{
    private Random randomInteger = new Random();
    public String garbledWord = "";

    public Person(String inputWord, String personName, String[] dictionary)
    {
        String[] localWordArray = inputWord.split(" ");
        int randomGetDictionaryWordIndex = randomInteger.nextInt(dictionary.length);
        int randomPutDictionaryWordIndex = randomInteger.nextInt(localWordArray.length);
        localWordArray[randomPutDictionaryWordIndex] = dictionary[randomGetDictionaryWordIndex];
        for (int i = 0; i < localWordArray.length; i++)
        {
            garbledWord =  garbledWord +localWordArray[i] + " ";
        }
        System.out.println(personName + "'s garbled word is " + garbledWord);
    }

   public String getGarbledWord()
   {
        return garbledWord;
   }
}
