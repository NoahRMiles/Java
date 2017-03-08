import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

/**
 * Created by Noah on 3/8/2017.
 */
public class Ranken {
    private JPanel RankensAuto;
    private JPanel south;
    private JButton calc;
    private JButton EXIT;
    private JPanel center;
    private JPanel top;
    private JPanel botom;
    private JTextField partTXT;
    private JTextField hourTXT;
    private JCheckBox oil;
    private JCheckBox lube;
    private JCheckBox radiator;
    private JCheckBox trans;
    private JCheckBox inspect;
    private JCheckBox muff;
    private JCheckBox tire;
    private JPanel east;
    private JPanel west;


    DecimalFormat money = new DecimalFormat("$#,##0.00");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ranken's Automotive Maintenance");
        frame.setContentPane(new Ranken().RankensAuto);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ranken() {
        EXIT.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        calc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Thread thread = new Thread( new Runnable(){
                    @Override
                    public void run()
                    {
                        calcTotal();
                    }
                });
                thread.start();
            }
        });
    }
    private void calcTotal(){
        double price  = 0.00;

        if(oil.isSelected()){
            price += 26.00;
        }
        if(lube.isSelected()){
            price += 18.00;
        }
        if(radiator.isSelected()){
            price += 30.00;
        }
        if(trans.isSelected()){
            price += 80.00;
        }
        if(inspect.isSelected()){
            price += 158.00;
        }
        if(muff.isSelected()){
            price += 100.00;
        }
        if(tire.isSelected()){
            price += 20.00;
        }

        double parts = Double.parseDouble(partTXT.getText());
        double hours = Double.parseDouble(hourTXT.getText()) * 20;

        price = price + parts + hours;




        JOptionPane.showMessageDialog(null, "Total Charges: " + money.format(price));



    }
}
