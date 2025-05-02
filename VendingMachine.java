public class VendingMachine {
    private Inventory inventory;
    private User user;

    public VendingMachine(User user, Inventory inventory){
        this.user=user;
        this.inventory=inventory;
    }

    public void insertCoin(Coin coin){
        user.insertCoin(coin);
    }

    public void selectItem(String itemName) {
        if(inventory.isItemAvailable(itemName)) {
            Item item=inventory.getItem(itemName);
            if(user.getBalance() >= item.getPrice()){
                user.resetBalance();
                inventory.reduceStock(itemName);
                System.out.println("Delivered" + item.getName());
            }else{
                System.out.println("Insufficient funds for" + item.getName());
            }
        }else{
            System.out.println(itemName+ "is out of stock");
        }
    }
    
    public void cancelTransaction(){
        System.out.println("Transaction canceled.Returning" + user.getBalance() + "balance");
        user.resetBalance();
    }

}
