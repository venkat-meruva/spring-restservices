package comspring.rest.jacksonobject;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import comspring.rest.jacksonobject.model.Employee;

@SpringBootApplication
public class JacksonToJava {

	public static void main(String[] args) {
		SpringApplication.run(JacksonToJava.class, args);
		Employee employee = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			employee = mapper.readValue(new File("c://temp/employee.json"), Employee.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(employee);
		
	}
}
