/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package firstjavaapp;
import com.Calculator;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
	Calculator o=new Calculator();
System.out.println(o.add(1,2));
    }
}
