public class Account {
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance<0){
            System.out.println("negative balance can't print");
        }
        else{
            this.balance=balance;
        }
    }
}
