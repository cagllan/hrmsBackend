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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import hrms.hrmsBackend.business.abstracts.JobSeekerSoftwareExperienceService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorDataResult;
import hrms.hrmsBackend.entities.concretes.JobSeekerSoftwareExperience;

@RestController
@RequestMapping("/api/jobseekersoftwareexperiences")
@CrossOrigin
public class JobSeekerSoftwareExperiencesController {

	private JobSeekerSoftwareExperienceService jobSeekerSoftwareExperienceService;

	@Autowired
	public JobSeekerSoftwareExperiencesController(
			JobSeekerSoftwareExperienceService jobSeekerSoftwareExperienceService) {
		super();
		this.jobSeekerSoftwareExperienceService = jobSeekerSoftwareExperienceService;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerSoftwareExperience jobSeekerSoftwareExperience) {
		return ResponseEntity.ok(this.jobSeekerSoftwareExperienceService.add(jobSeekerSoftwareExperience));
	}

	@GetMapping("/getall")
	public DataResult<List<JobSeekerSoftwareExperience>> getAll(){
		return this.jobSeekerSoftwareExperienceService.getAll();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String,String>();
		
		for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Do??rulama hatalar??");
		return errors;
	}
}
