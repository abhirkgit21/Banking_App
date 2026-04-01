package in.Abhi.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* in.Abhi.service.*.*(..))")
    public void logBefore(JoinPoint jp){
        System.out.println("Calling "+jp.getSignature());

    }
    @After("execution(* in.Abhi.service.*.*(..))")
    public void logAfter(JoinPoint jp) {
        System.out.println("Completed: " + jp.getSignature());
    }

}
