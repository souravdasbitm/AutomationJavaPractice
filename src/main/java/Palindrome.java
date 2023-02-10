public class Palindrome {
    public static boolean isPalindrome(String s){
        int n = s.length(); //4
        for(int i =0 ; i < n;i++){    // 0 ,1 ,2 ,3
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // adda   4   a=>0 , d=>1 , d=>2 , a =>3
        // sourav  6
        String s= "sourav";

        if(isPalindrome(s)){
            System.out.println(s+" string is palindrome");
        }else{
            System.out.println(s+" string is not palindrome");
        }
    }
}
