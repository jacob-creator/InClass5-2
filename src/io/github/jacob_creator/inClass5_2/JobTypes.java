package io.github.jacob_creator.inClass5_2;

public enum JobTypes {
    SOFTWARE_DEVELOPER("Software Developer", 59_000),
    SYSTEM_ADMINISTRATOR("System Administrator", 76_000),
    TECHNOLOGY_SUPPORT("Technology Support", 56_000),
    ASSISTANT_MANAGER("Assistant Manager", 64_000),
    GENERAL_MANAGER("General Manager", 98_000);

    private final String id, name;
    private final int salary;
    JobTypes(String name, int salary) {
        this.id = this.name();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary(GenderTypes gender) {
        return gender.equals(GenderTypes.MALE) ? salary : (int) ( salary * 0.8);
    }

    /**
     * This shouldn't ever be changed, as if this was a proper environment, it would be
     * used for saving to files and what not.
     * @return the ID of the job title.
     */
    public String getId() {
        return this.id;
    }
}
