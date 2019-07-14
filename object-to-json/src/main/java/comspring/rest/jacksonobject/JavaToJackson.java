package comspring.rest.jacksonobject;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import comspring.rest.jacksonobject.model.Employee;

@SpringBootApplication
public class JavaToJackson {

	public static void main(String[] args) {
		SpringApplication.run(JavaToJackson.class, args);
		@SuppressWarnings("deprecation")
		Employee employee = new Employee(1, "Venkat", "Meruva", new Date(1989, 8, 8));
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("c://temp/employee.json"), employee);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please check path");
	}

}
