import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTutorial {
    public static void main(String[] args) {
        //ArrayList

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            arrList.add(i);
        }
        System.out.println(arrList);
        //Remove value of an index
        arrList.remove(3);
        System.out.println(arrList);
        //Add value in an index
        arrList.add(3, 3);
        arrList.add(4, 31);
        System.out.println(arrList);

        List<Integer> interfaceList = new ArrayList<Integer>();
        interfaceList.add(1);

        System.out.println(interfaceList);

        // Insert a value in the last index, and you don't know the last index number

        // Fisrt ArrayList = [0, 1, 2, 3, 31, 4, 5, 6, 7, 8, 9, 10]
        // 2nd Arralist = [0, 1, 2, 3, 31, 4, 5, 6, 7, 8, 9, 10,90]

        //HashMap
        //[EmpID -> Integer , Name -> String]
        //[1234,"Vinod"]
        //[2234,"Abby"]

        Map<Integer, String> empMap = new HashMap<Integer, String>();

        empMap.put(1234, "Vinod");
        empMap.put(2234, "Abby");
        empMap.put(3234, "V");

        System.out.println(empMap.get(2234));

        System.out.println(empMap);

        for (Map.Entry<Integer, String> e : empMap.entrySet()) {
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }


        //TreeSet

        // Find out the duplicate value count using Map
    }
}
