/**
 * CS102-Section 1 - Lab 2 part d
 * @author Mehmet Kaan Örnek
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
      String filteredJavaScript = "";
      String filtered = "";
      
      for( int i = 0; i + 8 < source.length(); i++ )
      {
         if( !source.substring( i , i + 7 ).equals("<script") )
         {
            filteredJavaScript += source.charAt( i );
         }
         else
         {
            i = i+7;
            while( !source.substring(i,i+9).equals( "</script>" ) )
               i++;
            i = i+9;
         }
      }
      
      for( int i = 0; i < filteredJavaScript.length(); i++ )
      {
         if( filteredJavaScript.charAt(i) != '<' )
            filtered += filteredJavaScript.charAt(i);
         else
         {
            while( filteredJavaScript.charAt(i) != '>' )
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