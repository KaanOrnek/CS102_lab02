import cs1.SimpleURLReader;
import java.util.ArrayList;
/**
 * CS102-Section 1 - Lab 2 part b and c
 * @author Mehmet Kaan Örnek
 * @version 20.10.2020
 */ 
public class MySimpleURLReader extends SimpleURLReader
{
   private String givenUrl;
   
   public MySimpleURLReader( String url )
   {
      super( url );
      givenUrl = url;
   }
   
   public String getURL(){
      return givenUrl;
   }
   public String getName(){
      int index = 0;
      
      for( int i = givenUrl.length()-1; i > 0; i-- ){
         if( givenUrl.charAt(i) == '/' ){
            index = i;
            return givenUrl.substring(index+1);
         }
      }
      return null;
   }
   public int getNumberOfCSSLinks(){
      
      String source = this.getPageContents();
      int lengthOfTheURL = source.length();
      int numberOfCSSLinks = 0;
      int endOfTheLink = 0;
      ArrayList<String> links = new ArrayList<String>();
      
      
      for( int i = 0; i+5 < lengthOfTheURL; i++ )
      {
         if( source.substring(i,i+5).equals( "<link" ) )
         {
            for( int k = i; source.charAt(k)!= '>'; k++ )
               endOfTheLink = k+1;
            links.add( source.substring( i, endOfTheLink )  );
         }
      }
      
      for( String link : links )
      {
         for( int a=0; a+4<link.length(); a++ )
         {
            if( link.substring( a, a+4 ).equals( ".css" ) )
               numberOfCSSLinks++;
         }
      }
      return numberOfCSSLinks;
      
      
   }
}









