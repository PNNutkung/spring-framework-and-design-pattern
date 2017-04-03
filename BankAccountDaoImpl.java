/**
 * Created by nut on 4/3/17.
 */
public class BankAccountDaoImpl implements BankAccountDao {
    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        // TODO: create account and return it's primary key.
        return 1;
    }

    @Override
    public void subtractFromAccount(int bankAccountId, int amount) {
        // TODO: subtract fixed deposit amount from bank account.
    }
}
