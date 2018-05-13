import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrafUI {

    Decision decision = new Decision();

    JLabel labeldecision;

    JTextField fieldA;
    JTextField fieldB;
    JTextField fieldC;

    GrafUI () {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(220, 160);
        jf.setLocation(400,400);

        JPanel p = new JPanel(new MigLayout());

        jf.add(p);

        JLabel labelA = new JLabel("A");
        JLabel labelB = new JLabel("B");
        JLabel labelC = new JLabel("C");

        labeldecision = new JLabel("decision");

        fieldA = new JTextField(6);
        fieldB = new JTextField(6);
        fieldC = new JTextField(6);

        JButton butDec = new JButton("DECISION");

        p.add(labelA, "gapleft 30");
        p.add(labelB, "gapleft 30");
        p.add(labelC, "gapleft 30, wrap");
        p.add(fieldA);
        p.add(fieldB);
        p.add(fieldC, "wrap");
        p.add(butDec, "cell 1 2 2 0, wrap, width :75:85");
        p.add(labeldecision, "cell 0 3 3 0, width :200:300");

        ActionListener actionListener = new ButtonDesListener();
        butDec.addActionListener(actionListener);

        jf.pack();
        jf.setVisible(true);
    }

    public class ButtonDesListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String a = fieldA.getText().trim();
            Double aa = null;
            String b = fieldB.getText().trim();
            Double bb = null;
            String c = fieldC.getText();
            Double cc = null;
            if (!"".equals(a) && !"".equals(b) && !"".equals(c)) {
                aa = Double.parseDouble(a);
                bb = Double.parseDouble(b);
                cc = Double.parseDouble(c);

                decision.setA(aa);
                decision.setB(bb);
                decision.setC(cc);

                labeldecision.setText(decision.decisions());
            }
        }
    }
}
