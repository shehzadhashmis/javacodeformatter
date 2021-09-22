# Formatting Java Classes with Eclipse Formatter Maven plugin
 ![1*M7gYkSDwC5ny9SxxBwzozA](https://user-images.githubusercontent.com/91077741/134317603-b4fa5a76-815f-46e7-b5d7-f044b113fd24.png)

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

   <img width="1680" alt="Screen Shot 2021-09-22 at 12 34 05 PM" src="https://user-images.githubusercontent.com/91077741/134318036-1e1346fa-9efe-43ea-9ddd-40e7e0b28b79.png">

3. Run command
``` mvn clean install -U ```

    <img width="1680" alt="Screen Shot 2021-09-22 at 12 37 28 PM" src="https://user-images.githubusercontent.com/91077741/134318763-a1a7d210-c9f1-45b6-8de2-bae7d5c34de9.png">


4. Check the contents of the file EclipseCodeFormatterApplication.java after the formatting.
 
   <img width="1680" alt="Screen Shot 2021-09-22 at 12 34 50 PM" src="https://user-images.githubusercontent.com/91077741/134318058-372231e2-4e44-4753-804a-258b3f8311a1.png">
