package hrms.hrmsBackend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrmsBackend.business.abstracts.CorporationService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.Corporation;




@RestController
@RequestMapping("/api/corporations")
public class CorporationsController {

	private CorporationService corporationService;
	
	@Autowired
	public CorporationsController(CorporationService corporationService) {
		super();
		this.corporationService = corporationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Corporation corporation) {
		return this.corporationService.add(corporation);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Corporation>> getAll() {
		return this.corporationService.getAll();
	}
}
