public class Customer {

    private static int serialNum=1000;
    private int customerNum;
    private String customerName;
    private String customerId;
    private int usedTime;
    private int moneySpent;
    enum Category {GENERAL,VIP,VVIP}

    private Category category;
    public Customer(){
        this.customerNum=serialNum;
        serialNum++;
    }

    public Customer(String customerName,String customerId, int usedTime, int moneySpent, Category category){
        this.customerName=customerName;
        this.customerId=customerId;
        this.usedTime=usedTime;
        this.moneySpent=moneySpent;
        this.customerNum=serialNum;
        this.category=category;

        customerNum++;
    }


    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Customer.serialNum = serialNum;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
