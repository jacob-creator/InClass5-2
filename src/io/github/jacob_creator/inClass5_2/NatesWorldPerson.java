package io.github.jacob_creator.inClass5_2;

public abstract class NatesWorldPerson {

    private final GenderTypes gender;
    public NatesWorldPerson(GenderTypes gender) {
        this.gender = gender;
    }

    public GenderTypes getGender() {
        return gender;
    }
}
