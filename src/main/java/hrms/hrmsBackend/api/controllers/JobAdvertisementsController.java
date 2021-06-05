package hrms.hrmsBackend.api.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrmsBackend.business.abstracts.JobAdvertisementService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorDataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.entities.concretes.City;
import hrms.hrmsBackend.entities.concretes.JobAdvertisement;
import hrms.hrmsBackend.entities.dtos.JobAdvertisementWithActiveDto;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?>  add(@Valid @RequestBody JobAdvertisement jobAdvertisement) {
		return ResponseEntity.ok(this.jobAdvertisementService.add(jobAdvertisement));
	}
	
	
	@PostMapping("/updateJobAdvertisementDeActive")
	public Result updateJobAdvertisementDeActive(@RequestParam("id") int id){
		return this.jobAdvertisementService.updateJobAdvertisementDeActive(id);
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getJobAdvertisementWithActive")
	public DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActive() {
		return this.jobAdvertisementService.getJobAdvertisementWithActive();
	}
	
	
	@GetMapping("/getJobAdvertisementWithActiveAndReleaseDate")
	public DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActiveAndReleaseDate(@RequestParam("releaseDate") String releaseDate) {
		
		LocalDate localReleaseDate = LocalDate.parse(releaseDate);
		
		return this.jobAdvertisementService.getJobAdvertisementWithActiveAndReleaseDate(localReleaseDate);
	}
	
	
	@GetMapping("/getJobAdvertisementWithActiveAndCorporationId")
	public DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActiveAndReleaseDate(@RequestParam("id") int id) {
		
		return this.jobAdvertisementService.getJobAdvertisementWithActiveAndCorporationId(id);
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
