public class User {
    private String name;
    private int balance;

    public User(String name) {
        this.name=name;
        this.balance=0;
    }
    
    public void insertCoin(Coin coin){
        balance= balance+coin.getValue();
    }

    public int getBalance(){
        return balance;
    }

    public  void resetBalance(){
        balance=0;
    }

}
