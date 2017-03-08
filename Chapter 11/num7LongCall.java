import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Noah on 3/7/2017.
 */
public class num7LongCall {
    private JPanel num7LongCall;
    private JRadioButton DayRBTN;
    private JRadioButton eveningRBTN;
    private JRadioButton offRBTN;
    private JLabel time;
    private JTextField numMinutesTXT;
    private JButton calc;
    private JLabel LBL1;
    private JLabel totalLBL;

    public static void main(String[] args) {
        JFrame frame = new JFrame("num7LongCall");
        frame.setContentPane(new num7LongCall().num7LongCall);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public num7LongCall() {
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

    private void calcTotal() {



        double time = Double.parseDouble(numMinutesTXT.getText());



    }

}
