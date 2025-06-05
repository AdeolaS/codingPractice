public class Car{
    private String make;
    private String model;
    private int year;
    private String colour;

    public Car(String make, String model, int year, String colour){
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String newColour){
        this.colour = newColour;
    }

    public String getDetails(){
        String details = String.format("You have a %s %s %s made in the year %s. \n", this.colour, this.make, this.model, this.year);
        return details;
    }

}