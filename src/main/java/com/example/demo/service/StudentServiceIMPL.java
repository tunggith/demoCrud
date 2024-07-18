package com.example.demo.service;

import com.example.demo.dto.ReponseStructorDto;
import com.example.demo.entity.AccoutEntity;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService{
    @Autowired
    private StudentRepository repo;
    @Override
    public ReponseStructorDto<List<AccoutEntity>> getAll() {
        ReponseStructorDto<List<AccoutEntity>> success = new ReponseStructorDto<>(HttpStatus.OK.value(), "success", repo.findAll());
        return success;
    }

    @Override
    public ReponseStructorDto<AccoutEntity> add(AccoutEntity accoutEntity) {
        return  new ReponseStructorDto<>(HttpStatus.OK.value(), "success", repo.save(accoutEntity));
    }

    @Override
    public ReponseStructorDto<List<AccoutEntity>> delete(String username) {
        repo.deleteByUserName(username);
        return new ReponseStructorDto<>(HttpStatus.OK.value(), "success",repo.findAll());
    }

    @Override
    public ReponseStructorDto<AccoutEntity> update(AccoutEntity accoutEntity) {
        return  new ReponseStructorDto<>(HttpStatus.OK.value(), "success", repo.save(accoutEntity));
    }
}
