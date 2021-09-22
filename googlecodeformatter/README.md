# Formatting Java Classes with Google Formatter Maven plugin

## ![1*M7gYkSDwC5ny9SxxBwzozA](https://user-images.githubusercontent.com/91077741/134324199-90bbb2e7-0a70-470b-bfd5-447169aa6bc0.png)


This project is to demonstrate the formatting of the Java classes using Google maven plugin. You just need to define this plugin in your pom.xml.
```
<build>
    <plugins>
        <plugin>
          <groupId>com.theoryinpractise</groupId>
          <artifactId>googleformatter-maven-plugin</artifactId>
          <version>1.7.3</version>
          <executions>
              <execution>
                  <id>reformat-sources</id>
                  <configuration>
                      <includeStale>true</includeStale>
                      <style>GOOGLE</style>
                      <filterModified>false</filterModified>
                      <skip>false</skip>
                      <fixImports>false</fixImports>
                      <maxLineLength>100</maxLineLength>
                   </configuration>
                   <goals>
                      <goal>format</goal>
                   </goals>
                   <phase>process-sources</phase>
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

   <img width="1680" alt="Screen Shot 2021-09-22 at 2 57 50 PM" src="https://user-images.githubusercontent.com/91077741/134323911-1eb2af68-fc7c-4f0b-8be9-ecbc96f154b2.png">

3. Run command
``` mvn clean install -U ```
   
   <img width="1680" alt="Screen Shot 2021-09-22 at 1 06 10 PM" src="https://user-images.githubusercontent.com/91077741/134324066-ea6600f7-2122-422c-902b-d40b5e211705.png">

4. Check the contents of the file GoogleCodeFormatterApplication.java after the formatting.
   
   <img width="1680" alt="Screen Shot 2021-09-22 at 2 59 09 PM" src="https://user-images.githubusercontent.com/91077741/134323916-609dd82a-c105-43a0-be68-fac43bc63289.png">
