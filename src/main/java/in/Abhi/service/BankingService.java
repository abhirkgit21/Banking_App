package in.Abhi.service;

import in.Abhi.entity.Account;
import in.Abhi.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BankingService {

    @Autowired
    private AccountRepo accountRepo;

    public Account createAccount(Account acc){
        return accountRepo.save(acc);

    }
    public Account deposit(Long id, double amount) {
        Account acc = accountRepo.findById(id).orElseThrow();
        acc.setBalance(acc.getBalance() + amount);
        return accountRepo.save(acc);
    }
    public Account withdraw(Long id,double amount){
      Account acc =  accountRepo.findById(id).orElseThrow();
      //return accountRepo.save(acc);

      if(acc.getBalance()<amount){
          throw new RuntimeException("Insufficent Bal");
      }

        acc.setBalance(acc.getBalance() - amount);
        return accountRepo.save(acc);
    }


}
