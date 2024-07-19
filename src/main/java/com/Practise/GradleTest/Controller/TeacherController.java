package com.Practise.GradleTest.Controller;

import com.Practise.GradleTest.Entity.Teacher;
import com.Practise.GradleTest.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class TeacherController {

    @Autowired
    TeacherRepository trepo;

    @GetMapping("/test")
    public String test(){
        return "this is a test run";
    }

    @PostMapping("/save")
    public String save(@RequestBody Teacher teacher){
        trepo.save(teacher);
        return "Data Saved";
    }

    @GetMapping("/all")
    public List<Teacher> findAll(){
        return trepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Teacher> findById(@PathVariable int id){
        return trepo.findById(id);
    }

    @PutMapping("/updateall/{id}")
    public Teacher updateAll(@PathVariable int id, @RequestBody Teacher teacher){
        Teacher t=trepo.findById(id).get();

        t.setName(teacher.getName());
        t.setAddress(teacher.getAddress());
        return trepo.save(t);
    }


    @PatchMapping("/update/{id}")
    public Teacher updateOne(@PathVariable int id,@RequestBody Teacher teacher){
        Teacher t=trepo.findById(id).get();

        t.setName(teacher.getName());
        t.setAddress(teacher.getAddress());

        return trepo.save(t);
    }

    @RequestMapping("/update/{id}")
    public Teacher Update(@PathVariable int id, @RequestBody Map<String,Object> fields) {

        Optional<Teacher> t = trepo.findById(id);

        fields.forEach((key, value) ->
        {
            Field field = ReflectionUtils.findField(Teacher.class, key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, t.get(), value);
        });
        return trepo.save(t.get());
    }
}
