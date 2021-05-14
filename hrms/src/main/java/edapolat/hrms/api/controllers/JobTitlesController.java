package edapolat.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edapolat.hrms.business.abstracts.JobTitleService;
import edapolat.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/job-titles/")
public class JobTitlesController {

	private JobTitleService jobTitleService;
 
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
    }	
	
	@GetMapping("getall")
	public List<JobTitle> getAll(){
		return jobTitleService.getAll();
	}
	
}
