package equals;

public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
       Orange o  =(Orange) obj;
        return  (this.getColor() == o.getOrangeColor());
    }
}
