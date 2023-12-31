public class Car_Val {

    private int year ;
    private String model;
    private String color ;


    public Car_Val(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car_Val  {" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
