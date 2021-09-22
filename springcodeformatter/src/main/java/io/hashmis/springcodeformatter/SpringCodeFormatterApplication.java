package io.hashmis.springcodeformatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A Spring Boot application class to demonstrate Java code formatting with spring style
 * formatting.
 *
 * @author shehzadhashmis
 */
@Slf4j
@SpringBootApplication
public class
SpringCodeFormatterApplication
{

  public static void main(String[] args)
  {

    SpringApplication.run(SpringCodeFormatterApplication.class, args);

    methodWithMultipleArguments("Mr", "John", "Wick", "123456789", "jwick@testformatter.com", "test code formatter");
  }

  private static void methodWithMultipleArguments(String title, String firstName, String lastName, String phoneNumber, String email, String description)
  {
    log.info("Inside SpringCodeFormatterApplication.callMethodWithMultipleArguments method with title:{}, firstName:{}, lastName:{}, phoneNumber:{}, email:{}, description:{}", title, firstName, lastName, phoneNumber, email, description);
  }
}
