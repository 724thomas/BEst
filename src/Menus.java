import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menus {


    public void topMenu() throws IOException {
        int choice;

        System.out.println();
        System.out.println("==============================");
        System.out.println("1. Classification Parameter");
        System.out.println("2. Customer Data");
        System.out.println("3. Summary");
        System.out.println("4. Quit");
        System.out.println("==============================");
        System.out.print("Choose One : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice =Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                classificationParameterMenu();
                break;
            case 2:
                customerDataMenu();
                break;
            case 3:
                summaryMenu();
                break;
            case 4:
                quitMenu();
                break;
        }
        br.close();
    }


    //NF
    public void classificationParameterMenu() throws IOException {
        int choice;

        System.out.println();
        System.out.println("==============================");
        System.out.println("1. Set Parameter");
        System.out.println("2. View Parameter");
        System.out.println("3. Update Parameter");
        System.out.println("4. Back");
        System.out.println("==============================");
        System.out.print("Choose One : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice =Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                System.out.println("Set Parameter");
                break;
            case 2:
                System.out.println("View Parameter");
                break;
            case 3:
                System.out.println("Update Parameter");;
                break;
            case 4:
                topMenu();
                break;
        }
        br.close();
    }

    //NF
    public void customerDataMenu() throws IOException{
        int choice;

        System.out.println();
        System.out.println("==============================");
        System.out.println("1. Add Customer Data");
        System.out.println("2. View Customer Data");
        System.out.println("3. Update Customer Data");
        System.out.println("4. Delete Customer Data");
        System.out.println("5. Back");
        System.out.println("==============================");
        System.out.print("Choose One : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice =Integer.parseInt(br.readLine());
        switch(choice) {
            case 1:
                CustomerDataMenu.addCustomerData();
                break;
            case 2:
                System.out.println("View Customer Data");
                break;
            case 3:
                System.out.println("Update Customer Data");
                break;
            case 4:
                System.out.println("Delete Customer Data");
                break;
            case 5:
                topMenu();
        }
        br.close();
    }

    //NF
    public void summaryMenu() throws IOException {
        int choice;

        System.out.println();
        System.out.println("==============================");
        System.out.println("1. Summary");
        System.out.println("2. Summary (Sorted By Name)");
        System.out.println("3. Summary (Sorted By Spent Time)");
        System.out.println("4. Summary (Sorted By Total Payment)");
        System.out.println("5. Back");
        System.out.println("==============================");
        System.out.print("Choose One : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Summary");
                break;
            case 2:
                System.out.println("Summary (Sorted By Name)");
                break;
            case 3:
                System.out.println("Summary (Sorted By Spent Time)");
                break;
            case 4:
                System.out.println("Summary (Sorted By Total Payment)");
                break;
            case 5:
                topMenu();
        }
        br.close();
    }

    public void quitMenu() {
        System.out.println();
        System.out.println("Program Finished");
        System.out.println();
        System.out.println("Thomas OUT!");
        System.out.println();
    }


}
