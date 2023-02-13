public class ChildClass extends ParentClass {

    public void multiple(int i, int j) {
        System.out.println("This is the child method multiple of i and j ---> " + (i * j));
    }

    @Override
    public void overriddenMethod() {
        System.out.println("This is child method which will override the parent method");
    }

    public void useOfParentMethod(int i,int j){
      super.minus(i,j);
    }

    public  void parentChildOverrideMethod(){
        overriddenMethod();
        super.overriddenMethod();
    }
}
