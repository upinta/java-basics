package prototype.design.pattern;

import java.util.HashMap;
import java.util.Map;

public class StudentPrototypeRegistery {
    private final Map<String, Student> map;

    public StudentPrototypeRegistery() {
        this.map = new HashMap<>();
    }

    public void addPrototype(String name, Student s){
        map.put(name, s);
    }

    public Student getPrototype(String name) {
        return map.get(name);
    }
}
