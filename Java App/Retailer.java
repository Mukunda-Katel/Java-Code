public class Retailer extends Store 
{
    
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;

    //This is the constructor for the retailer class
    public Retailer(int storeId, String storeName, String location, String openingHour, int vatInclusivePrice, boolean isPaymentOnline, String purchasedYear) 
    {
        super(storeId, storeName, location, openingHour);//calling the constructor of superclass-store
        //Initializing the specific fields.
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
    }

    //This is getter method
    public int getVatInclusivePrice() 
    {
        return vatInclusivePrice;
    }

    public int getLoyaltyPoint() 
    {
        return loyaltyPoint;
    }

    public boolean getIsPaymentOnline() 
    {
        return isPaymentOnline;
    }

    public String getPurchasedYear() 
    {
        return purchasedYear;
    }

    //This is setter method
    public void setIsPaymentOnline(boolean newIsPaymentOnline) 
    {
        this.isPaymentOnline = newIsPaymentOnline;
    }

    public void setLoyaltyPoint(boolean isPaymentOnline, int vatInclusivePrice) 
    {
        if (isPaymentOnline) 
        {
            this.loyaltyPoint = (int) (vatInclusivePrice * 0.01);
        }
    }


    public void removeProduct() 
    {
        if (!isPaymentOnline && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) 
        {
            vatInclusivePrice = 0;
            loyaltyPoint = 0;
            isPaymentOnline = false;
        }
    }

    //This display the retailer information.
    public void display() 
    {
        super.display();
        if (vatInclusivePrice > 0) 
        {
            System.out.println("VAT Inclusive Price: $" + vatInclusivePrice);
            System.out.println("Loyalty Point: " + loyaltyPoint);
            System.out.println("Purchased Year: " + purchasedYear);
        } else 
        {
            System.out.println("Product has been removed.");
        }
    }
}