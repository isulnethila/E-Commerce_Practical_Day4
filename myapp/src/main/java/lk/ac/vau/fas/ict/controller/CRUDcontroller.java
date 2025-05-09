package lk.ac.vau.fas.ict.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CRUDcontroller<K, T> {

    private Map<K, T> objects = new HashMap<K, T>();

    public Map<K, T> getmap() {
        return objects;
    }

    @GetMapping("/")
    public Map<K, T> getAllObjects() {
        return objects;
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable("id") K id) {
        return objects.get(id);
    }

    @PostMapping("/")
    public String addItem(@RequestBody T t, @RequestBody K id) {
        objects.put(id, t);
        return "New Item Added";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable K id, @RequestBody T t) {
        if (objects.get(id) != null) {
            objects.put(id, t);
            return "The Details are updated";
        }
        return "Not Found";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") K id) {
        if (objects.get(id) != null) {
            objects.remove(id);
            return "Deleted Successfully";
        }
        return "Not Found";
    }
}
