package io.github.jacob_creator.inClass5_2;

public class Employee extends NatesWorldPerson {
    private final String name;
    private JobTypes job;

    public Employee(String name, GenderTypes gender, JobTypes job) {
        super(gender);
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public JobTypes getJob() {
        return job;
    }

    public void setJob(JobTypes job) {
        this.job = job;
    }

    /**
     * This is just a short cut to {@link JobTypes#getSalary(GenderTypes)}
     */
    public int getSalary() {
        return getJob().getSalary(super.getGender());
    }

}
