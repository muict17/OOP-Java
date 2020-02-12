package Generic.Question;

public class CodContent {
    private String companyName;
    private int amount;
    private String date;
    private String message;

    CodContent(String companyName, int amount, String date, String message){
        this.companyName = companyName;
        this.amount = amount;
        this.date = date;
        this.message = message;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
