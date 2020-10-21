/**
 * CS102-Section 1 - Lab 2 part f
 * @author Mehmet Kaan Örnek
 * @version 21.10.2020
 */ 
public class Test
{
   public static void main( String[] args)
   {

      // constants
      final String URL = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html";

      // variables
      
      //TEST FOR PART B - Testing MySimpleUrlReader
      MySimpleURLReader b = new MySimpleURLReader( URL );
      
      System.out.println( "getURL() method of MySimpleURLReader:\n" + b.getURL() + "\n\n" );
      
      
      
      //TEST FOR PART C - Testing MySimpleUrlReader
      System.out.println( "getNumberOfCSSLinks() method of MySimpleURLReader:\n" + b.getNumberOfCSSLinks() + "\n\n" );

      

      //TEST FOR PART D - Testing HTMLFilteredReader
      HTMLFilteredReader d = new HTMLFilteredReader( URL );
      
      System.out.println( "getPageContents() method of HTMLFilteredReader:\n" + d.getPageContents() + "\n\n" );
      
      
      
      //TEST FOR PART E - Testing WordSearch
      WordSearch e = new WordSearch( URL );
      
      System.out.println( "Word searching of WordSearch for the word Turkey:\n" + e.searchTheWord("Turkey") + "\n\n" );
      System.out.println( "Word searching of WordSearch for the word Ankara:\n" + e.searchTheWord("Ankara") + "\n\n" );
   }

}