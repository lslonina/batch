package batch.listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobStatusListener implements JobExecutionListener {
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job: " + jobExecution.getJobInstance().getJobName() + " is beginning");
    }

    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job: " + jobExecution.getJobInstance().getJobName() + " has completed");
        System.out.println("The Job Execution status is: " + jobExecution.getStatus());
    }
}