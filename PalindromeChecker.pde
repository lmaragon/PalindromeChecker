public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
  String s = noSpaces(word.toLowerCase());

  for (int i=0; i<s.length(); i++)
  {
    if (s.charAt(i) != s.charAt(s.length()-1-i))
    {
      return false;
    }
  }

  return true;
}

public String noSpaces(String sWord)
{

  String s = new String();

  
  for (int k = 0; k < sWord.length(); k++)
  {
    if (Character.isLetter(sWord.charAt(k)) == true)
    {
      s = s+sWord.charAt(k);
    }
    //if (sWord.charAt(k) != ' ')
    //{
    //  s = s + sWord.charAt(k);
    //} 
  }
  return s;
}

