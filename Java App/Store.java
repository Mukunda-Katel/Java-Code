public class Store 
{
    
    //declear class attributes
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;

    public Store(int storeId, String storeName, String location, String openingHour) 
    {
        //Assigning the parameters
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;
    }

    //accessor method
    public int getStoreId() 
    {
        return storeId;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    public String getLocation() 
    {
        return location;
    }

    public String getOpeningHour() 
    {
        return openingHour;
    }

    public double getTotalSales() 
    {
        return totalSales;
    }

    public double getTotalDiscount() 
    {
        return totalDiscount;
    }

    public void setTotalSales(double newSales) 
    {
        this.totalSales += newSales;
    }

    public void setTotalDiscount(double newDiscount) 
    {
        this.totalDiscount += newDiscount;
    }

    public void display() 
    {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Opening Hour: " + openingHour);
        
        if (totalSales > 0) 
        {
            System.out.println("Total Sales: $" + totalSales);
        } else 
        {
            System.out.println("The sale is not made yet: ");
        }
        
        if (totalDiscount > 0) 
        {
            System.out.println("Total Discount: $" + totalDiscount);
        } else 
        {
            System.out.println("The discount is not given yet.");
        }
    }
}