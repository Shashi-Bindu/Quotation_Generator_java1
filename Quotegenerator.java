import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotegenerator {
    private JPanel Main;
    private JTextField textField1;
    private JButton generateButton;
    private JTextField textField2;
    private JButton button1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;



     //private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt){
      //  if(comboBox2.getSelectedItem().equals("Honda")){
       //     comboBox3.setSelectedItem(null);
         //   comboBox3.addItem("1");
           // comboBox3.addItem("2");

     //   }
       // else
     //   if(comboBox2.getSelectedItem().equals("Toyota")){
       //     comboBox3.setSelectedItem(null);
         //   comboBox3.addItem("3");
        //    comboBox3.addItem("4");
       // }

        //}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quotegenerator");
        frame.setContentPane(new Quotegenerator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public  Quotegenerator(){

            comboBox1.setSelectedIndex(-1);
            comboBox1.addItem("choose...");
            comboBox1.addItem("New Vehicle");
            comboBox1.addItem("Existing Vehicle");
            comboBox2.setSelectedIndex(-1);
            comboBox2.addItem("choose...");
            comboBox2.addItem("Honda");
            comboBox2.addItem("Toyota");
            comboBox4.setSelectedIndex(-1);
            comboBox4.addItem("choose...");
            comboBox4.addItem("Comprehensive");
            comboBox4.addItem("Liability");
            comboBox5.setSelectedIndex(-1);
            comboBox5.addItem("choose...");
            comboBox5.addItem("<1");
            comboBox5.addItem("1");
            comboBox5.addItem("2");
            comboBox5.addItem("3");
            comboBox5.addItem("4");
            comboBox5.addItem("5");
            comboBox5.addItem("6");
            comboBox5.addItem("7");
            comboBox5.addItem("8");
            comboBox5.addItem("9");
            comboBox5.addItem("10");

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox2.getSelectedItem().equals("Honda")){
                    comboBox3.removeAllItems();
                    comboBox3.setSelectedItem(null);
                    comboBox3.setSelectedIndex(-1);
                    comboBox3.addItem("Choose...");
                    comboBox3.addItem("Honda Amaze");
                    comboBox3.addItem("Honda Accord");

                }
                else
                if(comboBox2.getSelectedItem().equals("Toyota")){
                    comboBox3.removeAllItems();
                    comboBox3.setSelectedItem(null);
                    comboBox3.setSelectedIndex(-1);
                    comboBox3.addItem("Choose...");
                    comboBox3.addItem("Fortuner");
                    comboBox3.addItem("Urban Cruiser");
                }


            }
        });
    }

        }









