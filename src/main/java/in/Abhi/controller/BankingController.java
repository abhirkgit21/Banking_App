package in.Abhi.controller;

import in.Abhi.entity.Account;
import in.Abhi.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bank")
@RestController
public class BankingController {

    @Autowired
    private BankingService service;

    @PostMapping("/create")
    public Account create(@RequestBody Account acc) {
        return service.createAccount(acc);
    }

    @PostMapping("/deposit")
    public Account deposit(@RequestParam Long id, @RequestParam double amount) {
        return service.deposit(id, amount);
    }

    @PostMapping("/withdraw")
    public Account withdraw(@RequestParam Long id, @RequestParam double amount) {
        return service.withdraw(id, amount);
    }
}
