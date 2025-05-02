# Vending-Machine-System

The vending machine system is designed to simulate the operations of a real vending machine, where users can insert coins, select items, and receive the selected item along with any necessary change. The system will handle inventory management, user transactions, and item dispensing.

 Key Requirements:

Coin Insertion:
  The user should be able to insert different denominations of coins, and the system should track the total balance inserted. Coins can include ₹1, ₹5, ₹10, ₹20, etc.

Item Selection:
 The user should be able to select an item from the available inventory, such as 'Coke', 'Pepsi', 'Water', etc. The system should check if the selected item is in stock and if the user has enough balance to 
 purchase it.

Dispensing Items:
 If the user has sufficient balance, the item is dispensed, and the user's balance is reset to zero. If the user doesn’t have enough money, an error message should be displayed.

Inventory Management:
 The vending machine should keep track of the available items and their stock. When an item is dispensed, the stock of that item should decrease by one.

Canceling a Transaction:
 The user should be able to cancel a transaction and receive the total balance inserted back.

Providing Change:
 If the user inserts more money than required for the item, the system should return the appropriate change.

I used an Object- Oriented approach for this.
I created the following classes:

Coin Class:
  The Coin class represents the different coin denominations. Each coin has a specific value, and the user inserts coins into the system to accumulate balance.

Item Class:
 The Item class represents the items in the vending machine. Each item has a name and price. The inventory management system checks if the item is available before dispensing it.

Inventory Class:
 The Inventory class tracks the available items and their quantities. It supports adding items, checking if items are in stock, and reducing stock when an item is dispensed.

User Class:
 The User class represents the person interacting with the vending machine. It keeps track of the user's balance (total inserted money) and provides methods for inserting coins and selecting items.

VendingMachine Class:
 The VendingMachine class manages the overall process, including inserting coins, selecting items, dispensing items, checking balances, and managing inventory. It interacts with the Coin, Item, and Inventory 
 classes to complete transactions.

Sample Workflow for the User:
   Let's walk through an example scenario. Suppose the user wants to buy a 'Coke' for ₹25:

 . The user inserts a ₹10 coin and then a ₹20 coin.
 . The system updates the balance to ₹30.
 . The user selects the 'Coke' item.
 . The system checks if the item is available and if the user has sufficient balance.
 . Since the balance is ₹30 and the 'Coke' costs ₹25, the item is dispensed, and ₹5 is returned as change.
 . The inventory of 'Coke' is updated to reflect that one item was dispensed, and the user’s balance is reset to ₹0.

  Error Handling:
  Insufficient Balance:
   If the user does not have enough money to buy the selected item, the system will notify the user that the transaction cannot proceed due to insufficient funds.

 Out of Stock:
  If the item the user wants to purchase is out of stock, the system will notify the user that the item is unavailable.

 Canceled Transactions:
  If the user decides to cancel the transaction, the system will return the full balance to the user.

In summary, the vending machine system is simple but flexible. It provides basic vending machine functionality like inserting coins, selecting items, dispensing items, and handling transactions. The modular design ensures that it's easily extensible for future enhancements














 
