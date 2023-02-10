public class RunnerClass {

    public static void main(String[] args) {
        ParentClass my = new ParentClass();

        my.sum(1,2);
        my.sum(1,2,3,"This");
        my.minus(1,2);

        ParentClass.division(4,2);

        ChildClass child = new ChildClass();

        child.multiple(1,2);
        child.sum(1,2);

        child.overriddenMethod();
        child.useOfParentMethod(8,9);


        // input --> a= 7 , b = 8
        // output --> a=8 , b =7

        // Implementation : It needs to be done without using any third variable


    }
}
