package batch.listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;
import org.springframework.stereotype.Component;

public class AnnotatedJobStatusListener {
    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job: " + jobExecution.getJobInstance().getJobName() + " is beginning");
    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job: " + jobExecution.getJobInstance().getJobName() + " has completed");
        System.out.println("The Job Execution status is: " + jobExecution.getStatus());
    }
}