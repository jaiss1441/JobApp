package com.vikas.JobApp.service;

import com.vikas.JobApp.model.JobPost;
import com.vikas.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    // method to add a jobPost
    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getallJobs(){
        return repo.getAllJobs();
    }
}
