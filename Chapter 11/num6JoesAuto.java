import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Noah on 3/7/2017.
 */
public class num6JoesAuto {
    private JLabel oilLBL;
    private JLabel lubeLBL;
    private JLabel radiatorLBL;
    private JLabel transLBL;
    private JLabel inspectLBL;
    private JLabel muffLBL;
    private JLabel tireLBL;
    private JButton calc;
    private JLabel LBL1;
    private JLabel totalLBL;
    private JTextField oilTXT;
    private JTextField lubeTXT;
    private JTextField radiTXT;
    private JTextField transTXT;
    private JTextField inspectTXT;
    private JTextField muffTXT;
    private JTextField tireTXT;
    private JTextField NonRTXT;
    private JPanel joesAuto;


    public num6JoesAuto() {
        calc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        calcTotal();
                    }
                });
                thread.start();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("num6JoesAuto");
        frame.setContentPane(new num6JoesAuto().joesAuto);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void calcTotal() {

        double oil = Double.parseDouble(oilTXT.getText()) * 26.00;
        double lube = Double.parseDouble(lubeTXT.getText()) * 18.00;
        double radi = Double.parseDouble(radiTXT.getText()) * 30.00;
        double trans = Double.parseDouble(transTXT.getText()) * 80.00;
        double inspect = Double.parseDouble(inspectTXT.getText()) * 15.00;
        double muff = Double.parseDouble(muffTXT.getText()) * 100.00;
        double tire = Double.parseDouble(tireTXT.getText()) * 20.00;
        double nonR = Double.parseDouble(NonRTXT.getText()) * 20.00;

        double total = oil + lube + radi + trans + inspect + muff + tire + nonR;


        totalLBL.setText(String.valueOf(total));


    }
}


