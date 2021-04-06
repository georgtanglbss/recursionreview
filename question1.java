public class question1
{
    public static  int findGCF(int a,int b) {
         if(a==0) 
            return b;
         else if(b==0)
            return a;
         else if(a==b)
            return a; 
         else if(a>b)
            return findGCF(a-b,b);
         else
            return findGCF(a,b-a);
    }

    public static void main(String[] args) {
      int a=147;
      int b=105;
      System.out.println(findGCF(a,b));
     }
}