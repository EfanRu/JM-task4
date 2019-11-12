package jm.task.task6;

public class Salary implements Sentable {
    private String from;
    private String to;
    private Integer salary;

    public Salary(String from, String to, Integer salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getContent() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
