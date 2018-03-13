package Chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
and returns a new map containing only the key/value pairs that exist in both of the parameter maps. In order for a
key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, but they need
to map it to the same value. For example, if the two maps passed are {Janet=87, Logan=62, Whitaker=46,
Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and {Logan=62, Kim=52, Whitaker=52,
Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}, your method would return the following new map
(the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52}.
 */
public class Exercise14 {
    //Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
    //and returns a new map containing only the key/value pairs that exist in both of the parameter maps. In order for a
    //key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, but they need
    //to map it to the same value. For example,if the two maps passed are {Janet=87, Logan=62, Whitaker=46,
    //Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and {Logan=62, Kim=52, Whitaker=52,
    //Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}, your method would return the following new map
    //(the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52}

    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);

        Exercise14 exercise14 = new Exercise14();
        System.out.println(exercise14.intersect(map1, map2));
    }

    private Map<String, Integer> intersect (Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map<String, Integer> result = new HashMap<>();
        Set<String> set = new HashSet<>(map1.keySet());

        for (String name:set)
        {
            if (map1.get(name).equals(map2.get(name))) result.put(name, map1.get(name));
        }

        return result;
    }
}
