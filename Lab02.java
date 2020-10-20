import cs1.SimpleURLReader;
/**
 * CS102-Section 1 - Lab 2
 * @author Mehmet Kaan Örnek
 * @version 20.10.2020
 */ 
public class Lab02
{
   public static void main( String[] args)
   {

      // constants

      // variables
      SimpleURLReader a = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt" );
      
      System.out.println( "The given url's content is:\n" + a.getPageContents() );
      System.out.println( "The given url's number of lines is:\n" + a.getLineCount() );
   }

}