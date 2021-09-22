# Formatting Java Classes with Spring Formatter Maven plugin

## ![](/Users/shhashmi/Downloads/1*M7gYkSDwC5ny9SxxBwzozA.png)

This project is to demonstrate the formatting of the Java classes using Spring maven plugin. You just need to define this plugin in your pom.xml.
```
<build>
    <plugins>
      <plugin>
          <groupId>io.spring.javaformat</groupId>
          <artifactId>spring-javaformat-maven-plugin</artifactId>
          <version>0.0.28</version>
          <executions>
              <execution>
                  <goals>
                      <goal>apply</goal>
                  </goals>
              </execution>
          </executions>
      </plugin>
    </plugins>
</build>
```
The details about this maven plugin and its usage can be found [here](https://github.com/talios/googleformatter-maven-plugin).

# How to run this application

1. Checkout this project.
2. Please note the contents of the class GoogleCodeFormatterApplication.java before formatting.

   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 1.50.18 PM.png)
3. Run command
``` mvn clean install -U ```
   
   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 1.31.29 PM.png)

4. Check the contents of the file GoogleCodeFormatterApplication.java after the formatting.
   
   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 1.31.08 PM.png)
