package workers;

import java.time.LocalDate;

public abstract class Personal {
    protected String name;
    protected LocalDate age;
    protected int workExperience;

    public Personal(String name, LocalDate age, int workExperience){
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
    }

    public String getInfo() {
        return String.format("%s, %s. ", name, age);
    }
}
