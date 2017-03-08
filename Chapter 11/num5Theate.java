import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Arc2D;

/**
 * Created by Noah on 3/7/2017.
 */
public class num5Theate {
    private JPanel theaterRevenue;
    private JLabel adultCostLBL;
    private JLabel adultNumLBL;
    private JLabel childCostLBL;
    private JLabel childNumLBL;
    private JTextField adultPriceTXT;
    private JTextField adultNumTXT;
    private JTextField childPriceTXT;
    private JTextField childNumTXT;
    private JButton calc;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel adultGrossLBL;
    private JLabel adultNetLBL;
    private JLabel childGrossLBL;
    private JLabel childNetLBL;
    private JLabel totalGrossLBL;
    private JLabel totalNetLBL;


    public num5Theate() {

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("num5Theate");
        frame.setContentPane(new num5Theate().theaterRevenue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    private void calcTotal(){

        final double KEAP = .20;

        double adultNum = Double.parseDouble(adultNumTXT.getText());
        double adultPrice = Double.parseDouble(adultPriceTXT.getText());
        double childNum = Double.parseDouble(childNumTXT.getText());
        double childPrice = Double.parseDouble(childPriceTXT.getText());

        double adultGross = adultNum * adultPrice;
        double adultNet = adultGross - (adultGross * KEAP);
        double childGross = childNum * childPrice;
        double childNet = childGross - (childGross * KEAP);

        double totalGross = childGross + adultGross;

        double totalNet = childNet + adultNet;


        adultGrossLBL.setText(String.valueOf(adultGross));
        adultNetLBL.setText(String.valueOf(adultNet));
        childGrossLBL.setText(String.valueOf(childGross));
        childNetLBL.setText(String.valueOf(childNet));
        totalGrossLBL.setText(String.valueOf(totalNet));
        totalNetLBL.setText(String.valueOf(totalNet));


    }
}


