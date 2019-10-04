public class HourlyClient extends Client {
    double hourlyRate;
    double hoursBilled;

    public HourlyClient() {
        this(null, null, null, null, null, 0, 0);
    }

    public HourlyClient(String companyName, String companyID, String billingAddress, String billingCity, String billingState, double hourlyRate, double hoursBilled) {
        super(companyName, companyID, billingAddress, billingCity, billingState);
        this.hourlyRate = hourlyRate;
        this.hoursBilled = hoursBilled;
    }

    public double billing(){
        return hourlyRate*hoursBilled;
    }
}
