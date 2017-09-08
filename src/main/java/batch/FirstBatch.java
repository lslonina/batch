package batch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;


public class FirstBatch implements Tasklet {
    private static Logger logger = LogManager.getLogger(FirstBatch.class.getName());

    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) {
        logger.info("** First Batch Job is Executing! **");
        return RepeatStatus.FINISHED;
    }
}
