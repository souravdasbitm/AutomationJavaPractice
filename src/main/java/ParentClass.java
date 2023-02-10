public class ParentClass {

    public void sum(int i, int j) {
        System.out.println("This is the sum of i and j --> " + (i + j));
    }

    public void minus(int i, int j) {
        System.out.println("This is the minus of i and j ---> " + (i - j));
    }

    public static void division(int i, int j) {
        System.out.println("This is the divide of i and j ---> " + (i / j));
    }

    //overloaded method
    public void sum(int i, int j, int k,String m) {
        System.out.println(m+" is the overloaded method sum of i , j and k --> " + (i + j + k));
    }

    public void overriddenMethod(){
        System.out.println("This is parent method which will be overriden");
    }
}
