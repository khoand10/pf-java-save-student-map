import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class appHashMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("ronaldo",20);
        students.put("messi",21);
        students.put("a",10);
        System.out.println(students.get("ronaldo"));
        Map<String, Integer> treemap = new TreeMap<>(students);
        System.out.println(treemap);
    }
}
