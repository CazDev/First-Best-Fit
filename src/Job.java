public class Job {
    
    private int submitTime;
    private int  jobID;
    private int  estRunTime;
    private int  coreReq;
    private int  memoryReq;
    private int  diskReq;

    // Job constructor
    // Requires the following parameters to create a job object:
    public Job(int submitTime, int jobID, int runTime, int coreReq, int memReq, int dkReq){
        this.submitTime = submitTime;
        this.jobID = jobID;
        this.estRunTime = runTime;
        this.coreReq = coreReq;
        this.memoryReq = memReq;
        this.diskReq = dkReq;
    }

    //
    // Identification
    //
    // jobid: Unique ID number
    public int getJobID(){
        return this.jobID;
    }

    //
    // Timing
    //
    // Submit Time: Job Submission Time
    public int getSubmitTime(){
        return this.submitTime;
    }

    //
    // Run Time: Estimated run time in seconds
    //
    public int getRunTime(){
        return this.estRunTime;
    }

    //
    // Resource requirements
    //
    // Cores: CPU cores required
    public int getCoreReq(){
        return this.coreReq;
    }
    
    //
    // Memory: Memory required in MB
    //
    public int getMemoryReq(){
        return this.memoryReq;
    }

    //
    // Disk: Disk space required in MB
    //
    public int getDiskReq(){
        return this.diskReq;
    }
}
