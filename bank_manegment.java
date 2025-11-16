

import java.util.Scanner;
public class bank_manegment {


    public static void createaccount(String checkAccount ,int balance){
        Scanner sc= new Scanner(System.in);
        if(checkAccount.compareTo("no")==0){//yaha bank account creat ho raha he
            System.out.println("bank account create  karo: ?  ");
            System.out.print("enter your name :");
            String name= sc.next();
            System.out.print("Enter a date (e.g., YYYY/MM/DD): ");
            String dob = sc.next();
             int doblength = dob.length();
            if (doblength!=10 || dob.charAt(4)!='/' ||dob.charAt(7)!='/' ){
                System.out.println("inveled DOB ! try again :");
                line(); // line function he jo line print karta he ok !
                createaccount(checkAccount, balance);

            }
             System.out.print("enter the your phone number :");
    
            String phoneNumber=sc.next();//bank acount ditels 
            int length1 = phoneNumber.length();
            char charter =phoneNumber.charAt(0 );
            char charter2 =phoneNumber.charAt(0 );
            char charter3 =phoneNumber.charAt(0 );
            char charter4 =phoneNumber.charAt(0 );
            if(length1!=10 || charter!='9' && charter2!='8' && charter3!='7'&& charter4!='6'){
                
                System.out.println("inveled phone number! try again :");
                line();
                createaccount(checkAccount, balance);

            }
            for(int i=0 ; i<100; i++){
                System.out.print("-");
            }
            System.out.println("-");
            ditels(name, dob, phoneNumber, balance);
        }
        else if(checkAccount.compareTo("yes")==0){//ager phele se account create he tab
                System.out.print(" Enter Your bank number : ");
                int nahi= sc.nextInt();  // yahe bank number enter kar bay ga 
                System.out.println("your bank balance is:" +balance);
                if (balance==0){
                    System.out.print( "ditosit  bank balance : ");
                    int addblence=sc.nextInt();
                    balance+=addblence;
                    
                    System.out.println("your bank balance deposit successfully!");
                    line();
                    balanceditels(balance);
                }
                }
                else{
                     System.out.println("invalid interaction ! sorry try again !");
                    }

    }

    public static void ditels( String name, String dob, String phoneNumber ,int balance) {

         int randomInt = (int) (Math.random() * 1000000000);
            System.out.println("your bank account create is successefully!");
            System.out.println("NAME: " +name);
            System.out.println("DOB: "+dob);
            System.out.println("PHONE: "+phoneNumber);
            System.out.println("ACCOUNT NUMBER : " + randomInt);
            System.out.println("YOUR BANK BELENCE :" +balance); 
            System.out.println("Thankyou ! ");
            line();
        
            balanceditels( balance);
    }


    public  static void line(){
          for(int i=0 ; i<100; i++){
            System.out.print("*");
            }
            System.out.println("*");

    }

    public static void balanceditels(int balance){//balance ditels ok
            System.out.print("kya tum rupees ko,DEPOSIT / WITHDRAWAL/ CHECK ,karna chahate ho:  ");
            Scanner sc= new Scanner(System.in);
            String userchosses=sc.next();
            if(userchosses.compareTo("deposit")==0){//diposit
                System.out.print(" enter deposit balance : ");
                int depositbal=sc.nextInt();
                balance+=depositbal;
                System.out.println("your bank balance deposit successefully!");
                line();
                balanceditels(balance);//
            }
            else if  (userchosses.compareTo("withdrawal")==0) {//withdrawal
                    System.out.print("enter withdrawa : ");
                    int withdrawabla= sc.nextInt();
                    balance= balance-withdrawabla;
                    System.out.println("your bank balance withdrawal successefully!");
                    line();
                    balanceditels(balance);
        
            }
            else if(userchosses.compareTo("check") ==0){//check
                    System.out.println("your bank balance is : "+balance);
                    line();
                    balanceditels(balance);
            }else{//invalid interaction
                    System.out.println("invalid interaction ! sorry try again !");
                    line();
                    balanceditels(balance);
                
                 } 
    }

   // this is a main function 
public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);//check kar rahe he ki account ha ya nahi.
    int balance=0; // yahe bank balance he ok.
    System.out.print("kya aap ke pass account he ? yes/no: ");
    String checkAccount= sc.next();
    createaccount(checkAccount ,balance);

  
}
}