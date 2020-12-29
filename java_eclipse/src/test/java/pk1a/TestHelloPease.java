package test.java.pk1a;

 //fffffffffffffffffffffffffffffffff
import main.java.pk1.HelloPease;
import junit.framework.*;
//fffff
public class  TestHelloPease extends TestCase {
  public void testSimpleMessage() {
  System.println("##teamcity[testStarted name='TestHelloPease']");
   	try 
{
    Thread.sleep(60000);
} 
catch(InterruptedException e)
{
     // this part is executed when an exception (in this example InterruptedException) occurs
}
     String message = new HelloPease("World222").sayHello();
     Assert.assertEquals("Test Hello Machine", "Hello, World222", message);
   System.println("##teamcity[testFinished  name='TestHelloPease']");
   
     }
}
