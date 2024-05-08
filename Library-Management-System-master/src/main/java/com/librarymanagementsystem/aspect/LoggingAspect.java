package com.librarymanagementsystem.aspect;

// import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component

public class LoggingAspect {

    
    @Before(value = "execution(* com.librarymanagementsystem.service.impl..*(..))")
    public void logBeforeAddBook() {
        System.out.println("Logging before excute ...");
        // System.out.println("Logging before Viewing a book...");
    }
    

}
