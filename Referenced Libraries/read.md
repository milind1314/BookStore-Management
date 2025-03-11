# Adding Referenced Library `servlet-api.jar` to a Servlet Program

## Step 1: Download `servlet-api.jar`
If you haven't already downloaded `servlet-api.jar`, you can get it from the official Apache Tomcat website:

- Go to [Apache Tomcat](https://tomcat.apache.org/)
- Download the appropriate version of Tomcat.
- Inside the `lib` folder of Tomcat, you'll find `servlet-api.jar`.

## Step 2: Add `servlet-api.jar` to Your Project

### **For Eclipse IDE**
1. **Right-click** on your project in the **Project Explorer**.
2. Navigate to **Build Path** → **Configure Build Path**.
3. Go to the **Libraries** tab.
4. Click **Classpath** → **Add External JARs...**.
5. Browse to the location where `servlet-api.jar` is saved.
6. Select it and click **Open**.
7. Click **Apply and Close**.

### **For IntelliJ IDEA**
1. Open **Project Structure** (`Ctrl + Alt + Shift + S` on Windows/Linux, `Cmd + ;` on Mac).
2. Navigate to **Modules** → **Dependencies**.
3. Click **+ (Add)** → **JARs or directories**.
4. Locate `servlet-api.jar` and click **OK**.
5. Apply changes and close the dialog.

### **For Manual Compilation (Command Line)**
If compiling from the command line, use:
```sh
javac -cp "/path/to/servlet-api.jar:." YourServlet.java
```

## Step 3: Verify the Setup
- Check that your servlet imports `javax.servlet.*` and `javax.servlet.http.*` without errors.
- Restart your IDE if necessary.
- Run your servlet on a servlet container (e.g., Tomcat) to ensure it works correctly.

Now your servlet program is properly configured with `servlet-api.jar`! 🚀

