package com.example.student.service.service;

import com.example.student.service.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Map<String, List<StudentDto>> createStudentsDto();
}
