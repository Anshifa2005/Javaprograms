import java.awt.*;
import java.awt.event.*;

public class ListBoxExample extends Frame implements ActionListener {

    
    List itemList;
    TextField inputField;
    Button addButton, removeButton, exitButton;
    Label titleLabel;

    public ListBoxExample() {
        
        setTitle("AWT List Box Example");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);

        
        titleLabel = new Label("Enter item and click Add or Remove:");
        add(titleLabel);

        
        inputField = new TextField(20);
        add(inputField);

       
        addButton = new Button("Add");
        removeButton = new Button("Remove");
        exitButton = new Button("Exit");

        add(addButton);
        add(removeButton);
        add(exitButton);

        
        itemList = new List(10, false); 
        add(itemList);

        addButton.addActionListener(this);
        removeButton.addActionListener(this);
        exitButton.addActionListener(this);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Add")) {
            String item = inputField.getText().trim();
            if (!item.isEmpty()) {
                itemList.add(item);
                inputField.setText("");
            }
        } 
        else if (command.equals("Remove")) {
            int selectedIndex = itemList.getSelectedIndex();
            if (selectedIndex != -1) {
                itemList.remove(selectedIndex);
            }
        } 
        else if (command.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ListBoxExample();
    }
}
