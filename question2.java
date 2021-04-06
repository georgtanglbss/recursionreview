public class question2{
    public void triangle(int n){
        if(n==0)
          return;
        else 
          triangle(n);
          return printStars(n-1);
    }
    public static reverseTriangle(int n){

    }
}
    
public void printStars(int n){
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
      System.out.println("");
    }

public static void main(String[] args) {

}

