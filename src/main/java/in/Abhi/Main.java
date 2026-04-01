package in.Abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);

        System.out.println("App run*******!");
        System.out.println("Abhi new Sop add");
    }
}