import cs1.SimpleURLReader;
/**
 * CS102-Section 1 - Lab 2
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
}