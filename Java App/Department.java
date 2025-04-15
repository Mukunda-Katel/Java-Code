public class Department extends Store 
{
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    public Department(int storeId, String storeName, String location, String openingHour, String productName, double markedPrice) 
    {
        super(storeId, storeName, location, openingHour);
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.sellingPrice = 0.0;
        this.isInSales = true;
    }

    public String getProductName() 
    {
        return productName;
    }

    public double getMarkedPrice() 
    {
        return markedPrice;
    }

    public double getSellingPrice() 
    {
        return sellingPrice;
    }

    public boolean getIsInSales() 
    {
        return isInSales;
    }

    public void setMarkedPrice(double newMarkedPrice) 
    {
        this.markedPrice = newMarkedPrice;
    }

    public void calculateDiscountPrice(boolean isInSales, double markedPrice) 
    {
        if (isInSales) 
        {
            if (markedPrice >= 5000) 
            {
                sellingPrice = markedPrice - (markedPrice * 0.20);
            } else if (markedPrice >= 3000 && markedPrice < 5000) 
            {
                sellingPrice = markedPrice - (markedPrice * 0.10);
            } else if (markedPrice >= 1000 && markedPrice < 3000) 
            {
                sellingPrice = markedPrice - (markedPrice * 0.05);
            } else 
            {
                sellingPrice = markedPrice;
            }
            super.setTotalSales(sellingPrice);
            super.setTotalDiscount(markedPrice - sellingPrice);
            this.isInSales = false;
        }
    }

    public void display() 
    {
        super.display();
        if (isInSales) 
        {
            System.out.println("Product Name: " + productName);
            System.out.println("Marked Price: $" + markedPrice);
        } else 
        {
            System.out.println("Product Name: " + productName);
            System.out.println("Selling Price: $" + sellingPrice);
        }
    }
}