public class ChildClass extends ParentClass {

    ParentClass p = new ParentClass();
    public void multiple(int i, int j) {
        System.out.println("This is the child method multiple of i and j ---> " + (i * j));
    }

    @Override
    public void overriddenMethod() {
        System.out.println("This is child method which will override the parent method");
    }

    public void useOfParentMethod(int i,int j){
      p.minus(i,j);
    }
}
