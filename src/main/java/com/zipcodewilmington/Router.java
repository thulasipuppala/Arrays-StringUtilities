package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Router {
    Map<String, String> map = new TreeMap<>();
    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public int size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.put(path, studentController);
    }

    public void remove(String path) {
        if(map.containsKey(path))
            map.remove(path);
    }

    @Override
    public String toString() {
        String s = "";
        for(String key : map.keySet())
            s +=  key + " -> " + map.get(key) + "\n";
        return s;
    }
}
