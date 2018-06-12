class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    invoice invoiceObj = new invoice("abcx12", "comb", 50, 2.63);
    
    System.out.println(invoiceObj.getPaymentAmount());

    salariedEmployee salariedEmplyObj = new salariedEmployee("Alex", "Suglio", "xxx-xx-xxxx", 30.50);

    System.out.println(salariedEmplyObj.getPaymentAmount());

  }
}