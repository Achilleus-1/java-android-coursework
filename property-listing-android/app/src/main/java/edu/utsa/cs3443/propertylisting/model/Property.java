package edu.utsa.cs3443.propertylisting.model;

public abstract class Property

{

    private String id;

    private String location;

     private double price;

    // makers

    public Property(String id, String location, double price)
    {
         this.id = id;
         this.location = location;
            this.price = price;
    }


    //  gets
        public String getId() { return id; }
      public String getLocation() { return location; }
         public double getPrice() { return price; }

    // sets
      public void setId(String id) { this.id = id; }

       public void setLocation(String location) { this.location = location; }

      public void setPrice(double price) { this.price = price; }


    //abstract tostring method
    public abstract String toString();
}
