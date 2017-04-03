package service;

import dao.BankAccountDao;
import domain.BankAccountDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nut on 4/3/17.
 */
@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
    private static Logger logger = Logger.getLogger(BankAccountServiceImpl.class);

    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccountService(BankAccountDetails bankAccountDetails) {
        logger.info("createBankAccount method invoked.");
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }
}
