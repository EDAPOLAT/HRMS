package edapolat.hrms.business.abstracts;

import java.util.List;

import edapolat.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	
	List<JobTitle> getAll();
}
