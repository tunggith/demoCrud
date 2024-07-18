package com.example.demo.service;

import com.example.demo.dto.ReponseStructorDto;
import com.example.demo.entity.AccoutEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    ReponseStructorDto<List<AccoutEntity>> getAll();
    ReponseStructorDto<AccoutEntity> add(AccoutEntity accoutEntity);
    ReponseStructorDto<List<AccoutEntity>> delete(String username);
    ReponseStructorDto<AccoutEntity> update(AccoutEntity accoutEntity);

}
