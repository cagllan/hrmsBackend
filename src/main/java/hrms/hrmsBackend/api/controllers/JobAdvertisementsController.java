package hrms.hrmsBackend.api.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrmsBackend.business.abstracts.JobAdvertisementService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
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
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
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

	
	
}
