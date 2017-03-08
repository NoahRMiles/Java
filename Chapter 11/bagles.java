import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

/**
 * Created by Noah on 3/8/2017.
 */
public class bagles {
    private JPanel JPanelBoarder;
    private JPanel North;
    private JPanel East;
    private JPanel West;
    private JPanel south;
    private JPanel Center;
    private JLabel Title;
    private JButton calc;
    private JButton EXIT;
    private JRadioButton whiteRBtn;
    private JRadioButton wholeWheatRBtn;
    private JCheckBox creamCheeseCheckBox;
    private JCheckBox butterCheckBox;
    private JCheckBox peachJellyCheckBox;
    private JCheckBox blueberryJamCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton regularCoffeeRadioButton;
    private JRadioButton decafCoffeeRadioButton;
    private JRadioButton cappuccinoRadioButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Order Calculator");
        frame.setContentPane(new bagles().JPanelBoarder);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public bagles() {
        JPanelBoarder.setPreferredSize(new Dimension(400, 200));


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

    DecimalFormat money = new DecimalFormat("$#,##0.00");

    private void calcTotal(){
        double price  = 0;

        if(whiteRBtn.isSelected()){
            price += 1.25;
        }
        if (wholeWheatRBtn.isSelected()){
            price += 1.50;
        }
        if(creamCheeseCheckBox.isSelected()){
            price += 0.50;
        }
        if(butterCheckBox.isSelected()){
            price += 0.25;
        }
        if(peachJellyCheckBox.isSelected()){
            price += 0.75;
        }
        if(blueberryJamCheckBox.isSelected()){
            price += .75;
        }
        if(noneRadioButton.isSelected()){
            price += 0.0;
        }
        if(regularCoffeeRadioButton.isSelected()){
            price+= 1.25;
        }
        if(decafCoffeeRadioButton.isSelected()){
            price+= 1.25;
        }
        if(cappuccinoRadioButton.isSelected()){
            price += 2.00;
        }
        double tax = price * 0.06;
        double total = price + tax;

        JOptionPane.showMessageDialog(null, "SubTotal" + money.format(price) + "\nTax " + money.format(tax) + "\nTotal" + money.format(total));




    }
}
