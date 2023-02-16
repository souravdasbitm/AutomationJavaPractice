import java.util.Arrays;

public class RunnerClass {

    public static void main(String[] args) {
//        ParentClass my = new ParentClass();
//
//        my.sum(1, 2);
//        my.sum(1, 2, 3, "This");
//        my.minus(1, 2);
//
//        ParentClass.division(4, 2);
//
//        ChildClass child = new ChildClass();
//
//        child.multiple(1, 2);
//        child.sum(1, 2);
//
//        child.overriddenMethod();
//        child.useOfParentMethod(8, 9);
//
//        child.parentChildOverrideMethod();
//
//        StudentConstructor stuc = new StudentConstructor("Vinod", 1);
//
//        stuc.display();

        int[] arr = {4, 7, 5, 8};


        // getting the array with for loop
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

        System.out.println("This is my original array");

        //getting the array in foreach loop
        for (int n : arr) {
            System.out.println(n);
        }

        System.out.println("This is my sorted array");
        Arrays.sort(arr);

        for (int n : arr) {
            System.out.println(n);
        }

        //Get the scened the highest value of the array.
        // array = 7,8,5,4,9,10
        int[] second = {7, 8, 5, 4, 0, 10};
        Arrays.sort(second);
        System.out.println("This is second highest value of the array--> " + second[second.length - 2]);
    }
}
