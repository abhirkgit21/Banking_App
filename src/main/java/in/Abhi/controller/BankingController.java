package in.Abhi.controller;

import in.Abhi.entity.Account;
import in.Abhi.service.BankingService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bank")
@RestController
public class BankingController {

    private final BankingService service;

    // ✅ Constructor Injection
    public BankingController(BankingService service) {
        this.service = service;
    }

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

    @GetMapping("/{id}")
    public Account findById(@PathVariable Long id) {
        return service.getAccountById(id); // ✅ correct
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id) {
        service.deleteAccount(id);
        return "Account deleted successfully with id: " + id;
    }
}