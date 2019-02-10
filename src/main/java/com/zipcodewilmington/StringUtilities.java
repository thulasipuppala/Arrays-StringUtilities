public class StringUtilities {
   public Character getMiddleCharacter(String word){
       if(word.length()%2 == 0){
            return word.charAt(word.length()/2);
        }
        else{
            return word.charAt(word.length()/2);
        }
   }
   
   public String removeCharacter(String value, char charToRemove){
       StringBuilder b = new StringBuilder(value);
       /*for(int i=0;i<value.length;i++)
        if(value.charAt(i) == charToRemove)
            value.charAt(i+1) = 
            */
           
       for(int i=0;i<b.length();i++){
           if(b.charAt(i) == charToRemove){
               b.deleteCharAt(i);
                if(i<b.length() && b.charAt(i) == charToRemove)
                    b.deleteCharAt(i); 
                    if(i<b.length() && b.charAt(i) == charToRemove)
                        b.deleteCharAt(i);
            }
            }
       value ="";
       value = String.format("%s",b.toString());
       
       /*String newString ="";
       
       for(int i=0;i<value.length();i++){
           if(value.charAt(i) == charToRemove){
            newString = value.substring(0,i)+value.substring(i+1);
            break;
           }
        }*/
       return value;  
   }
   
   public String getLastWord(String value) {
         String ar[] = value.split(" ");
      
       
       return ar[(ar.length-1)];
   }
}
