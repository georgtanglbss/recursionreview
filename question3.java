public class question3
{
public static String reverse(String word){
  
  if(word.isEmpty())
  return word;
  word.substring(1);
  return reverse(word.substring(1))+word.charAt(0);
} 

public static void main(String[] args) {
  String word = "recursion111";
  String ret = reverse(word);
  System.out.print(ret);
}
}


