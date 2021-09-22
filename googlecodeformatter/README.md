# Formatting Java Classes with Google Formatter Maven plugin

## ![](/Users/shhashmi/Downloads/1*M7gYkSDwC5ny9SxxBwzozA.png)

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

   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 12.50.18 PM.png)
3. Run command
``` mvn clean install -U ```
   
   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 1.06.10 PM.png)

4. Check the contents of the file GoogleCodeFormatterApplication.java after the formatting.
   
   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 1.05.53 PM.png)
