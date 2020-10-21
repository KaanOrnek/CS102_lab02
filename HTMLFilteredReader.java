/**
 * CS102-Section 1 - Lab 2 part d
 * @author Mehmet Kaan �rnek
 * @version 20.10.2020
 */ 
public class HTMLFilteredReader extends MySimpleURLReader
{
   
   public HTMLFilteredReader( String url )
   {
      super( url );
   }
   
   public String getPageContents()
   {
      String source = this.getUnfilteredPageContents();
      String filtered = "";
      
      for( int i = 0; i < source.length(); i++ )
      {
         if( source.charAt(i) != '<' )
            filtered += source.charAt(i);
         else
         {
            while( source.charAt(i) != '>' )
               i++;
         }
      }
      return filtered;
      
   }
   
   public String getUnfilteredPageContents()
   {
      return super.getPageContents();
   }

}