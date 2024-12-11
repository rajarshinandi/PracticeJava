
// Iterate map

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class _03MapPrograms {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("Raj",35);
        student.put("Tom",50);

        Set<Map.Entry<String, Integer>> entries = student.entrySet();
        for(Map.Entry<String, Integer> e:entries){
            System.out.println(e.getKey() + " = " + e.getValue());
        }

    }
}


