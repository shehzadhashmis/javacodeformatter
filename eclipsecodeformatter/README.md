# Formatting Java Classes with Eclipse Formatter Maven plugin

## ![](/Users/shhashmi/Downloads/1*M7gYkSDwC5ny9SxxBwzozA.png)

This project is to demonstrate the formatting of the Java classes using Eclipse maven plugin. You just need to define this plugin in your pom.xml.
```
<build>
    <plugins>
        <plugin>
            <groupId>net.revelc.code.formatter</groupId>
            <artifactId>formatter-maven-plugin</artifactId>
            <version>2.16.0</version>
            <configuration>
                    <skip>${skipFormat}</skip>
            </configuration>
            <executions>
                <execution>
                    <goals>
                        <goal>format</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
The details about this maven plugin and its usage can be found [here](https://github.com/revelc/formatter-maven-plugin).

# How to run this application

1. Checkout this project.
2. Please note the contents of the class EclipseCodeFormatterApplication.java before formatting.

   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 12.34.05 PM.png)
3. Run command
``` mvn clean install -U ```

   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 12.37.28 PM.png)
4. Check the contents of the file EclipseCodeFormatterApplication.java after the formatting.
 
   ![](/Users/shhashmi/Desktop/Screen Shot 2021-09-22 at 12.34.50 PM.png)
