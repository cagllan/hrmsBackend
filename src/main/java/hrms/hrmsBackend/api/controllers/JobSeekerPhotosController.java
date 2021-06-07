package hrms.hrmsBackend.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrmsBackend.business.abstracts.JobSeekerPhotoService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorDataResult;
import hrms.hrmsBackend.entities.concretes.JobSeekerPhoto;

@RestController
@RequestMapping("/api/jobseekerphotos")
public class JobSeekerPhotosController {

	private JobSeekerPhotoService jobSeekerPhotoService;

	@Autowired
	public JobSeekerPhotosController(JobSeekerPhotoService jobSeekerPhotoService) {
		super();
		this.jobSeekerPhotoService = jobSeekerPhotoService;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerPhoto jobSeekerPhoto) {
		return ResponseEntity.ok(this.jobSeekerPhotoService.add(jobSeekerPhoto));
	}

	@GetMapping("/getall")
	public DataResult<List<JobSeekerPhoto>> getAll(){
		return this.jobSeekerPhotoService.getAll();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String,String>();
		
		for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları");
		return errors;
	}
}
