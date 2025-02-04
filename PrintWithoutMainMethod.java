import java.applet.Applet;
class PrintWithoutMainMethod{
    static{
        System.out.println("Hello");
 System.exit(0);  
    }
}

// Java Applets are deprecated and won't run in newer Java versions.
//For VS Code: You must have main(). There's no way around it.
//For Other Java Runtimes (Older or Different IDEs): Static blocks or JavaFX can work.