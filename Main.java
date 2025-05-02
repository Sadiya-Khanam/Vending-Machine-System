public class Main {
    public static void main(String[] arg){
        User user= new User("John");
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Coke", 25), 5);
        inventory.addItem(new Item("Pepsi", 35), 3);

        VendingMachine vm= new VendingMachine(user, inventory);

        user.insertCoin(new Coin(Coin.Denomination.TEN));
        user.insertCoin(new Coin(Coin.Denomination.FIVE));

        vm.selectItem("Coke");

        user.insertCoin(new Coin(Coin.Denomination.TWENTY));
        vm.selectItem("Pepsi");

        vm.cancelTransaction();

        
    }
    
}
