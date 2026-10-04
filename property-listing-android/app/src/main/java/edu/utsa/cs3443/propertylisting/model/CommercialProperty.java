package edu.utsa.cs3443.propertylisting.model;


public class CommercialProperty extends Property {

    private String zone;

     private int numberOfUnits;


    private int numberOfParkingSpots;

    // makers
    public CommercialProperty(String id, String location, double price, String zone, int numberOfUnits, int numberOfParkingSpots) {

        super(id, location, price); // calls "Property"


         this.zone = zone;

         this.numberOfUnits = numberOfUnits;

             this.numberOfParkingSpots = numberOfParkingSpots;
     }

    // gets and sets both

    public String getZone() { return zone; }


     public void setZone(String zone) { this.zone = zone; }


        public int getNumberOfUnits() { return numberOfUnits; }
      public void setNumberOfUnits(int numberOfUnits) { this.numberOfUnits = numberOfUnits; }

       public int getNumberOfParkingSpots() { return numberOfParkingSpots; }

        public void setNumberOfParkingSpots(int numberOfParkingSpots) { this.numberOfParkingSpots = numberOfParkingSpots; }




    @Override
    public String toString()
    {
        return getLocation() + " - $" + getPrice();
    }


}
