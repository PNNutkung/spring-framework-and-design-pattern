/**
 * Created by nut on 4/3/17.
 */
public interface BankAccountDao {
    public int createBankAccount(BankAccountDetails bankAccountDetails);
    public void subtractFromAccount(int bankAccountId, int amount);
}
