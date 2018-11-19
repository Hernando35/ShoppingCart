


public class Product {
    private Integer feet;
    private Double inches;

    public Product (Integer feet, Double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Integer getFeet() {
        return feet;
    }

    public void setFeet(Integer feet) {
        this.feet = feet;
    }

    public Double getInches() {
        return inches;
    }

    public void setInches(Double inches) {
        this.inches = inches;
    }
}
