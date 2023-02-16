public class ConversionType {

    public static void main(String[] args) {
        String convStr = "9";
        int contInt = 9;

        // Convert String to Integer --> Integer.valueOf(<value>)
        if (contInt == Integer.valueOf(convStr)) {
            System.out.println("String to Integer");
        } else {
            System.out.println("No");
        }
        // Convert Integer to String --> String.valueOf(<value>)
        if (convStr.equals(String.valueOf(contInt))) {
            System.out.println("Integer to String");
        } else {
            System.out.println("No");
        }

    }
}
