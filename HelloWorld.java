import java.io.PrintWriter;

public class HelloWorld{
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, GitHub!");
    pen.println ("Goodbye");
    pen.flush();
    pen.close();
  } // main(String[])

}
git commit -m "Initial commit";
