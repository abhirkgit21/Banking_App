package in.Abhi.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Before("execution(* com.example.BankingController.*.*(..))")
    public void checkAccess() {

        String user = "Admin"; // later from JWT

        System.out.println("User " + user + " accessed API");
    }
}
