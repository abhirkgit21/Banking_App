package in.Abhi.logging;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

    @AfterThrowing(
            pointcut = "execution(* com.example.bank.service.*.*(..))",
            throwing = "ex"
    )
    public void handleError(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}
