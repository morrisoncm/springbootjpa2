package com.demo.jpa2.mapping;

import static org.apache.commons.beanutils.BeanUtils.copyProperties;

import com.demo.jpa2.domain.dto.ProfessorDto;
import com.demo.jpa2.domain.dto.StudentDto;
import com.demo.jpa2.domain.dto.SubjectDto;
import com.demo.jpa2.domain.entity.Professor;
import com.demo.jpa2.domain.entity.Student;
import com.demo.jpa2.domain.entity.Subject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
public class DtoToEntity {

  public static Subject getSubject(SubjectDto subjectDto) {
    try {
      Subject subject = new Subject();
      copyProperties(subject, subjectDto);
      return subject;
    } catch (Exception cause) {
      log.error("getSubject() -> mappig failed ", cause);
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Subject mapping failed");
    }
  }

  public static Student getStudent(StudentDto studentDto) {
    try {
      Student student = new Student();
      copyProperties(student, studentDto);
      return student;
    } catch (Exception cause) {
      log.error("getStudent() -> mappig failed ", cause);
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Student mapping failed");
    }
  }

  public static Professor getProfessor(ProfessorDto professorDto) {
    try {
      Professor professor = new Professor();
      copyProperties(professor, professorDto);
      return professor;
    } catch (Exception cause) {
      log.error("getProfessor() -> mapping failed ", cause);
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Professor mapping failed");
    }
  }

}
