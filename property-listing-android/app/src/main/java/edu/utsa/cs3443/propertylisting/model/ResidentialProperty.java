package edu.utsa.cs3443.propertylisting.model;




public class ResidentialProperty extends Property {
    private double hoaFees;
    private int numberOfBedrooms;
    private double numberOfBathrooms;





    public ResidentialProperty(String id, String location, double price, double hoaFees, int numberOfBedrooms, double numberOfBathrooms)
    {
        super(id, location, price);


        this.hoaFees = hoaFees;

            this.numberOfBedrooms = numberOfBedrooms;

            this.numberOfBathrooms = numberOfBathrooms;

    }




    public double getHoaFees() { return hoaFees; }

    public int getNumberOfBedrooms() { return numberOfBedrooms; }

    public double getNumberOfBathrooms() { return numberOfBathrooms; }



    @Override

    public String toString() {
        return getLocation() + " - $" + getPrice();
    }
}
