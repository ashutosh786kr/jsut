import java.applet.*;
import java.awt.*;

public class p1 extends Applet {
    private String rollNo;
    private String name;
    private String branch;
    private String section;

    public void init() {
        // Initialize user information
        rollNo = "1737";
        name = "KUMAR AYUSH";
        branch = "Computer Science";
        section = "02";
    }

    public void paint(Graphics g) {
        // Set font and color for text
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.BLUE);

        // Display user information in separate lines
        g.drawString("Roll No.: " + rollNo, 20, 20);
        g.drawString("Name: " + name, 20, 40);
        g.drawString("Branch: " + branch, 20, 60);
        g.drawString("Section: " + section, 20, 80);
    }
}

/*
<applet code="p1" width=300 height=100>
</applet>
*/