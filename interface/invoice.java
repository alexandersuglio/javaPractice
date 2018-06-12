public class invoice implements payable{
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  public invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.quantity = quantity; 
    this.pricePerItem = pricePerItem;
  }

  public void setPartNumber(String partNumber){
    this.partNumber = partNumber;
  }

  public String getPartNumber(){
    return partNumber;
  }

  public void setPartDescription(String partDescription){
    this.partDescription = partDescription;
  }

  public String getPartDescription(){
    return partDescription;
  }

  public void setQuantity(int count){
    if (count >= 0){
    this.quantity = count;
    }
    else {
      throw new IllegalArgumentException("Quantity can't be negative!");
    }

  }

  public int getQuantity(){
    return quantity;
  }

  public void setPricePerItem(double price ){
    if (price >=0){
this.pricePerItem = pricePerItem;
    }
    else {
      throw new IllegalArgumentException("Price can't be negative!");
    }
      }

      public double getPricePerItem(){
        return pricePerItem;
      }

      @Override
      public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
      }

}