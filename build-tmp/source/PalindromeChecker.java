import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

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

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
