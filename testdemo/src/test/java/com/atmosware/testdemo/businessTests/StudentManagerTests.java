package com.atmosware.testdemo.businessTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.atmosware.testdemo.business.common.exceptions.BusinessException;
import com.atmosware.testdemo.business.concretes.StudentManager;
import com.atmosware.testdemo.entities.concretes.Student;

public class StudentManagerTests {
	
	StudentManager studentManager;
	
	@BeforeEach
	public void setup() {
		studentManager = new StudentManager();
	}	
	
	@Test
	public void should_throw_exception_when_student_with_existing_name_added() {
		
		Student student = new Student(6, "Engin");
		
		Exception exception = assertThrows(BusinessException.class,() -> studentManager.add(student));
		
		assertEquals("Bu Ogrenci Mevcut", exception.getMessage());
	}
	
}
