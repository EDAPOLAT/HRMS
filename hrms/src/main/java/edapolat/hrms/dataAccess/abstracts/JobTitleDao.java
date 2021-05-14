package edapolat.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import edapolat.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
