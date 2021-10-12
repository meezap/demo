package com.example.meenaSQLExp.meenaSQLExp.cont;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.meenaSQLExp.meenaSQLExp.DTO.PersonForm;
import com.example.meenaSQLExp.meenaSQLExp.repo.MyRepo;

@RestController
public class Cont1 {
	
	
	@Autowired
	MyRepo repo;
	@GetMapping("/getmeena")
	public String m1() {
		System.out.println(repo.findById(1));
		return "MEENA Retuened";
	}
	
	@GetMapping("/getMine")
	public String mine() {
		//repo.findById(1);
		return "non repo method";
	}
	
	@PostMapping("/validateBody")
	  ResponseEntity<String> validateBody(@Valid @RequestBody PersonForm input) {
	    return ResponseEntity.ok("valid");
	  }
	
		/*
		 * @ExceptionHandler(ConstraintViolationException.class)
		 * 
		 * @ResponseStatus(HttpStatus.BAD_REQUEST) ResponseEntity<String>
		 * handleConstraintViolationException(ConstraintViolationException e) { return
		 * new ResponseEntity<>("not valid due to validation error: " + e.getMessage(),
		 * HttpStatus.BAD_REQUEST); }
		 */

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	
	
}
