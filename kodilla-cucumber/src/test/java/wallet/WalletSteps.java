package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {


        Given("I have deposited $200 in my wallet", () -> {

            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {

            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance",170, wallet.getBalance());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
        });

        When("I check the balance of my wallet", () -> {
            Assert.assertEquals("Incorrect wallet balance",100, wallet.getBalance());
        });

        Then("I should see that the balance is $100", () -> {
            wallet.getBalance();
        });

        When("I withdraw $200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals("Incorrect wallet balance",100, wallet.getBalance());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("Incorrect wallet balance",100, wallet.getBalance());
        });
        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);

        });


        When("I request {int}", (Integer int1) -> {
            cashier.withdraw(wallet, int1);

        });



        Then("{int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(int1.intValue(), cashSlot.getContents());

        });



        Then("the balance of my wallet should be {int}", (Integer int1) -> {
            Assert.assertEquals("Incorrect wallet balance",int1.intValue(), wallet.getBalance());

        });

        }
}
