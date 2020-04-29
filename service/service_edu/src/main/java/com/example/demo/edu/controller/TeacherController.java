package com.example.demo.edu.controller;


import com.example.demo.edu.entity.Teacher;
import com.example.demo.edu.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zhoutao
 * @since 2020-04-29
 */
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {
    @Resource
    TeacherService teacherService;

    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list(null);
        return list;

    }

    @DeleteMapping({id})
    public  boolean remobe(@PathVariable String id){
        teacherService.removeById(id);

    }

}

