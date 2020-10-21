/**
 * CS102-Section 1 - Lab 2 part e
 * @author Mehmet Kaan Örnek
 * @version 20.10.2020
 */ 
public class WordSearch extends HTMLFilteredReader
{
   
   private String textOfUrl;
   
   public WordSearch( String url )
   {
      super( url );
      textOfUrl = this.getPageContents();
   }
   
   public int searchTheWord( String desiredWord ){
      
      for( int i = 0; i < textOfUrl.length()-desiredWord.length(); i++ )
      {
         if( textOfUrl.substring(i, i+desiredWord.length() ).equals( desiredWord ) )
         {
            return i;
         }
      }
      return -1;
   }

}