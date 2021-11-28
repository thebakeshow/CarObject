public class CarObject
{
private String model;
private String manufacturer;
private int year;
private double price;
private boolean hasAC;

public CarObject(String model, String manufacturer, int year, double price, boolean hasAC)
{
this.model = model;
this.manufacturer= manufacturer;
this.year = year;
this.price  = price;
this.hasAC = hasAC;
}
public CarObject()
{
model= "Corrolla";
manufacturer = "Toyota";
year = 2013;
price= 13000.00;
hasAC = true;
}
public void setModel( String newModel)
{ 
model = newModel;
}
public String getModel()
{
  return model;
}
public void setManufacturer( String newManufacturer)
{ 
  manufacturer = newManufacturer;
}
public String getManufacturer()
{
  return manufacturer;
}
public void setYear(int newYear)
{
year = newYear;
}
public int getYear()
{
  return year;
}
public void setPrice(double newPrice)
{
  price = newPrice;
}
public double getPrice()
{
  return price;
}
public void setHasAC(boolean newHasAC)
{
  hasAC = newHasAC;
}
public boolean getHasAC()
{
  return hasAC;
}

}
