package Jakson;

import java.math.BigDecimal;
import java.util.List;


public class Staff {
    public String getName1() {
        return name1;
    }

    public int getAge1() {
        return age1;
    }

    public String getPosition1() {
        return position1;
    }

    public BigDecimal getSalary1() {
        return salary1;
    }

    public List<String> getSkills1() {
        return skills1;
    }

    private String name1;
    private int age1;
    private String position1;
    private BigDecimal salary1;
    private List<String> skills1;

    public Staff() {

    }

    public void setName(String mkyong) {
        name1 = mkyong;
    }

    public void setAge(int i) {
        age1 = i;
    }

    public void setPosition(String developer) {
        position1 = developer;
    }

    public void setSalary(BigDecimal bigDecimal) {
        salary1 = bigDecimal;
    }

    public void setSkills(List<String> skills) {
        skills1 = skills;
    }
}
