import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerDataMenu {

    public static void addCustomerData() throws IOException {
        int choice;
        System.out.print("How many customers to input?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice =Integer.parseInt(br.readLine());


        for (int i=0; i<choice; i++){
            customerInputMenu(i);

        }
        br.close();
    }

    public static Customer customerInputMenu(int i) throws IOException {
        int choice;

        Customer customer1 = new Customer();
        System.out.println("====== Customer" + i +"Info. ======");
        System.out.println();
        System.out.println("==============================");
        System.out.println("1. Customer Name");
        System.out.println("2. Customer ID");
        System.out.println("3. Customer Spent Time");
        System.out.println("4. Customer Total Pay");
        System.out.println("5. Back");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice =Integer.parseInt(br.readLine());
        switch()
        //System.out.println(); 이 Back을 누르면 반복이 되기때문에 따로 빼야할거같음
        
        
        return customer1;
    }


}
