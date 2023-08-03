
//completed
public class Biker {
    private String model;
    private String description;
    private String color;
    private double price;

    public Biker(String model, String description, String color, double price) {
        this.model = model;
        this.description = description;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
    	return price;
    }
    public void setPrice(double price) {
    	this.price = price;
    }

}


