package com.ditemis.jberet;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;

public class Main {
    public static void main(String[] args) {
        try {
            JobOperator jo = BatchRuntime.getJobOperator();
            long id = jo.start("helloworldjob", null);
            System.out.println("Batchlet submitted: " + id);
            Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println("Error submitting Job! " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
