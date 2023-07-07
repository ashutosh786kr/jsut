import java.applet.Applet;
import java.awt.*;

/*
<applet code="p3" width=300 height=100>
</applet>
*/

public class p3 extends Applet {
    private Label label;
    private TextField textField;
    private TextArea textArea;
    private Checkbox checkbox1, checkbox2;
    private CheckboxGroup checkboxGroup;
    private Button button;

    public void init() {
        label = new Label("Enter your name:");
        textField = new TextField(20);
        textArea = new TextArea(5, 20);
        checkbox1 = new Checkbox("Option 1");
        checkbox2 = new Checkbox("Option 2");
        checkboxGroup = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Radio 1", checkboxGroup, true);
        Checkbox radio2 = new Checkbox("Radio 2", checkboxGroup, false);
        button = new Button("Submit");

        add(label);
        add(textField);
        add(textArea);
        add(checkbox1);
        add(checkbox2);
        add(radio1);
        add(radio2);
        add(button);
    }
}