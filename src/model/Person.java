package model;

import java.util.Objects;

public class Person {
    String name;
    int YearOfBirth;
    String job;

    public Person() {
    }

    public Person(String name, int YearOfBirth, String job) {
        this.name = name;
        this.YearOfBirth = YearOfBirth;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return this.YearOfBirth;
    }

    public void setYearOfBirth(int YearOfBirth) {
        this.YearOfBirth = YearOfBirth;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person YearOfBirth(int YearOfBirth) {
        setYearOfBirth(YearOfBirth);
        return this;
    }

    public Person job(String job) {
        setJob(job);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && YearOfBirth == person.YearOfBirth && Objects.equals(job, person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, YearOfBirth, job);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", dayOfBirth='" + getYearOfBirth() + "'" +
            ", job='" + getJob() + "'" +
            "}";
    }

}
