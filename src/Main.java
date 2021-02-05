// Naive shopping experience where the input (an index) comes
// from the command line, the store (an arraylist of myItem) is
// hardcoded, and basic error checking is done.
//
// Richard Zhang
// Feb 2ed 2021



import java.util.ArrayList;

public class Main {

    // create Store
    private static ArrayList<myItem> Store;

    public static boolean isNumber(String str){
        for (int i=0; i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        myItem item1=new myItem("hat",10.0);
        myItem item2=new myItem("apple",1.0);
        myItem item3=new myItem("banana",2.0);
        myItem item4=new myItem("iphone",1099.0);
        myItem item5=new myItem("macbook",2099.0);
        myItem item6=new myItem("canteen",20.0);

        Store=new ArrayList<>();
        double subtotal=0.0;

        Store.add(item1);
        Store.add(item2);
        Store.add(item3);
        Store.add(item4);
        Store.add(item5);
        Store.add(item6);
        Store.add(new myItem("water bottol",10.0));
        Store.add(new myItem("calculus textbook",100.0));
        Store.add(new myItem("cookie",2.0));
        Store.add(new myItem("facial mask",5.0));

        System.out.println("****** grocery store receipt ******");
        for(int i=0; i< args.length; i++) {
            try {
                //System.out.print("args[" + i + "]" + args[i]+" ");
                subtotal += Store.get(Integer.parseInt(args[i]) - 1).getItemPrice();
                System.out.println(Store.get(Integer.parseInt(args[i]) - 1).toString());
            } catch (NumberFormatException e) {
                System.out.println("illegal input <" + args[i] + ">");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("illegal Store index <" + args[i] + ">");
            }
        }

        System.out.println("**********************************");
        System.out.println("SUBTOTAL: $"+subtotal);
        System.out.printf("SALE TAX: $%.2f",subtotal*0.05);
        System.out.println("");
        System.out.printf("TOTAL: $%.2f",subtotal*1.05);
        System.out.println("");
        System.out.println("**********************************");

    }
}
