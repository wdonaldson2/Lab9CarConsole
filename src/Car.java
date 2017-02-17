import java.text.NumberFormat;

/**
 * Created by williamdonaldson on 2/16/17.
 */
public class Car {
    //Create a class named Car to store data
    //This class should contain four detail about the car right below
    private String make;
    private String model;
    private int year;
    private double price;

    //no-argument constructor that set data members
    public Car() {

    make = "";
    model = "";
    year = 0;
    price = 0.0;
    }
    //setting a constructor with four arguments that matches the elements above
    //storing values in instance variables
    public Car (String make, String model, int year,
                  double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }

    public Car (String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.price = 0.0; //giving a default
    }

    //Getters and setters for all data members

    //Getters section
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //Setters section

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //A toString() method returning a formatted String with the car details
    public String toString() {

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(2);

        return make + " \t|" + "\t" + model + "\t|" + "\t" + year + "\t|" + "\t"
                + "$" + numberFormat.format(price);
    }
}
