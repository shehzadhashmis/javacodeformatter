# Formatting Java Classes with Spring Formatter Maven plugin

## ![1*M7gYkSDwC5ny9SxxBwzozA](https://user-images.githubusercontent.com/91077741/134320902-8e336969-8b79-4da2-981f-fd1d032ba274.png)

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

   <img width="1680" alt="Screen Shot 2021-09-22 at 1 31 08 PM" src="https://user-images.githubusercontent.com/91077741/134320975-1a9b30fb-c67f-41c4-b78a-060464ca83c9.png">


3. Run command
``` mvn clean install -U ```
   
   <img width="1680" alt="Screen Shot 2021-09-22 at 1 50 18 PM" src="https://user-images.githubusercontent.com/91077741/134320962-95330927-030b-4436-9337-722473d47254.png">

4. Check the contents of the file GoogleCodeFormatterApplication.java after the formatting.
   
   <img width="1680" alt="Screen Shot 2021-09-22 at 1 31 29 PM" src="https://user-images.githubusercontent.com/91077741/134320980-f30676b7-98ed-41aa-a9f6-7843bca8a9a6.png">
