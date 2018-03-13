package MyFirstMavenProject.domain;

public class Animal {
    public String getName() {
        return name;
    }

    public int getNumber_of_legs() {
        return number_of_legs;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String name;
   // private Integer number_of_legs;
    private int number_of_legs;
    private String color;

}
