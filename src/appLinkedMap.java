import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class appLinkedMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("ronaldo", 20);
        students.put("amessi", 21);
        students.put("khoa",19);
        students.put("a",19);
        System.out.println(students);
    }
}
