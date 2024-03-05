package com.characterbook.learnspringbootbackend;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "INAF"),
				new Course(2, "Learn AWS1", "INAF2"),
				new Course(3, "Learn AWS3", "INA3F")
				);
	}
}
