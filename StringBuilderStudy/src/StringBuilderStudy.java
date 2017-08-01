import java.util.Random;

/**
 * Created by VicMini on 7/11/15.
 */

public class StringBuilderStudy
{
    public String[] dictionary = {"alpha", "beta", "gamma", "delta", "epsilon"};
    private String testString = "one two three four five";
    private String[] splitArray;
    private Random randomInteger = new Random();

    public static void main(String[] args)
    {
        new StringBuilderStudy().getGoing();
    }

    private void getGoing()
    {
        Person person0 = new Person(testString, "Person0", dictionary);
        Person person1 = new Person(person0.getGarbledWord(), "Person1", dictionary);
        Person person2 = new Person(person1.getGarbledWord(), "Person2", dictionary);
        Person person3 = new Person(person2.getGarbledWord(), "Person3", dictionary);
//        String passedWord = "";
//        splitArray = testString.split(" ");
//        passedWord = person0(testString);
//        passedWord = person1(passedWord);
//        passedWord = person2(passedWord);

    }

    public String[] getDictionary()
    {
         return dictionary;
    }

    private String person0(String inputWord)
    {
        String garbledWord = "";
        String[] localWordArray = inputWord.split(" ");
        int randomGetDictionaryWordIndex = randomInteger.nextInt(dictionary.length);
        int randomPutDictionaryWordIndex = randomInteger.nextInt(localWordArray.length);
        localWordArray[randomPutDictionaryWordIndex] = dictionary[randomGetDictionaryWordIndex];
        for (int i = 0; i < localWordArray.length - 1 ; i++)
        {
          garbledWord = garbledWord + " " +localWordArray[i];
      }
        System.out.println("Person0 garbled word is " + garbledWord);
        return garbledWord;
    }
    private String person1(String inputWord)
    {
        String garbledWord = "";
        String[] localWordArray = inputWord.split(" ");
        int randomGetDictionaryWordIndex = randomInteger.nextInt(dictionary.length);
        int randomPutDictionaryWordIndex = randomInteger.nextInt(localWordArray.length);
        localWordArray[randomPutDictionaryWordIndex] = dictionary[randomGetDictionaryWordIndex];
        for (int i = 0; i < localWordArray.length - 1 ; i++)
        {
            garbledWord = garbledWord + " " +localWordArray[i];
        }
        System.out.println("Person1 garbled word is " + garbledWord);
        return garbledWord;
    }
    private String person2(String inputWord)
    {
        String garbledWord = "";
        String[] localWordArray = inputWord.split(" ");
        int randomGetDictionaryWordIndex = randomInteger.nextInt(dictionary.length);
        int randomPutDictionaryWordIndex = randomInteger.nextInt(localWordArray.length);
        localWordArray[randomPutDictionaryWordIndex] = dictionary[randomGetDictionaryWordIndex];
        for (int i = 0; i < localWordArray.length - 1 ; i++)
        {
            garbledWord = garbledWord + " " +localWordArray[i];
        }
        System.out.println("Person2 garbled word is " + garbledWord);
        return garbledWord;
    }
}
