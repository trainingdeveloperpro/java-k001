package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class {
    Map<Integer, Student> classes;

    public Class() {
    }

    public Class(Map<Integer,Student> classes) {
        this.classes = classes;
    }

    public Map<Integer, Student> getClasses() {
        return classes;
    }

    public void setClasses(Map<Integer, Student> classes) {
        this.classes = classes;
    }

    public void print(){
        System.out.println("List of student:");
        Set<Integer> set = classes.keySet();
        for(Integer key : set) {
            System.out.print(key + " ");
            classes.get(key).print();
        }
    }
}
