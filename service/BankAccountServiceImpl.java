package service;

import dao.BankAccountDao;
import domain.BankAccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Created by nut on 4/3/17.
 */
@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
    private static Logger logger = Logger.getLogger(String.valueOf(BankAccountServiceImpl.class));

    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccountService(BankAccountDetails bankAccountDetails) {
        Logger.info
    }
}
