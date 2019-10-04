public class Client {
    String companyName;
    String companyID;
    String billingAddress;
    String billingCity;
    String billingState;

    public Client() {
        this(null, null, null, null, null);
    }

    public Client(String companyName, String companyID, String billingAddress, String billingCity, String billingState) {
        this.companyName = companyName;
        this.companyID = companyID;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
    }
}
