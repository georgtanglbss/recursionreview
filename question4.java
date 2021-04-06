public class question4{
    static boolean isPalindrome(String str){
        //String str = str.toLowerCase();
        //.replaceAll("\\s+", "")
        if(str.length() == 0)
        return true;
        return recPalindrome(str,0,str.length()-1);
    }

    static boolean recPalindrome(String text, int forward, int backward) {
        if (forward == backward) {//one char
            return true;
        }else if ((text.charAt(forward)) != (text.charAt(backward))) {//1st and last
            return false;
        }else if (forward < backward + 1) {//middle substring
            return recPalindrome(text, forward + 1, backward - 1);
        }
        return true;
    }

    public static void main(String args[])
    {
        String str = "civic";
        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
