package com.example.demo.controller;

import com.example.demo.dto.ReponseStructorDto;
import com.example.demo.entity.AccoutEntity;
import com.example.demo.service.StudentServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentCController {
    @Autowired
    private StudentServiceIMPL studentServiceIMPL;
    @GetMapping("all")
    public ReponseStructorDto<List<AccoutEntity>> getAll(){
        return studentServiceIMPL.getAll();
    }
    @PostMapping("add")
    public ReponseStructorDto<AccoutEntity> add(AccoutEntity accoutEntity){
        return studentServiceIMPL.add(accoutEntity);
    }
    @DeleteMapping("delete/{username}")
    public ReponseStructorDto<List<AccoutEntity>> delete(@PathVariable String userName){
        return studentServiceIMPL.delete(userName);
    }
    @PutMapping("update")
    public  ReponseStructorDto<AccoutEntity> update(AccoutEntity accoutEntity){
        return studentServiceIMPL.add(accoutEntity);
    }
}
