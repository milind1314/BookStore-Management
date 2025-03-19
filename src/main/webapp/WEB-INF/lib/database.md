# Adding ojdbc8.jar to a Servlet Project

## Prerequisites
- Ensure you have **Oracle JDBC Driver (ojdbc8.jar)** downloaded. You can get it from the [Oracle website](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html).
- You should have a **Servlet-based project** set up in an IDE such as Eclipse or IntelliJ IDEA.

## Steps to Add ojdbc8.jar to Your Project

### 1. Adding ojdbc8.jar Manually
#### **In Eclipse IDE**
1. Copy the `ojdbc8.jar` file to your project’s `src/main/webapp/WEB-INF/lib` directory.
2. Right-click on your project in **Project Explorer**.
3. Select **Build Path** → **Configure Build Path**.
4. Under the **Libraries** tab, click **Add JARs...**.
5. Navigate to `src/main/webapp/WEB-INF/lib`, select `ojdbc8.jar`, and click OK.
6. Click **Apply and Close**.

#### **In IntelliJ IDEA**
1. Copy `ojdbc8.jar` into your project’s `src/main/webapp/WEB-INF/lib` folder.
2. Right-click on the `ojdbc8.jar` file and select **Add as Library**.
3. Ensure it is added to the classpath in **File** → **Project Structure** → **Libraries**.

### 2. Adding ojdbc8.jar via Maven (Optional)
If you are using Maven, add the following dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc8</artifactId>
    <version>19.8.0.0</version>
</dependency>
```
> Note: Versions may vary; check Oracle's official Maven repository for the latest version.

## Verify Connection
To ensure `ojdbc8.jar` is working, test the database connection using a simple Java program:

```java
import java.sql.Connection;
import java.sql.DriverManager;

public class TestDBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");
            System.out.println("Connection Successful!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
Replace `localhost:1521:xe`, `username`, and `password` with your actual database details.

## Conclusion
Following these steps, you should have successfully added `ojdbc8.jar` to your Servlet project’s `src/main/webapp/WEB-INF/lib` folder and established a connection to Oracle Database.

