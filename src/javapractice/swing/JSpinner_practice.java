package javapractice.swing;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.DateFormatSymbols;


class mySppiner extends JFrame implements ActionListener,ListSelectionListener,ChangeListener
{
    JSpinner s1,s2;
    JTextField tf;
    JComboBox b1;
    JList list;
    
    public mySppiner()
    {
        super("MY SPINNER DEMO");
        
        String city[] = {"JABALPUR","BHOPAL","INDORE","DEWAS","KATNI","SATNA"};
        String month[];
        
        month = new DateFormatSymbols().getMonths();
        
        String days[];
        days = new DateFormatSymbols().getWeekdays();
        
        list = new JList(month);
        list.setVisibleRowCount(5);
//        list.setBounds(30, 30, 80, 100);
        s1 = new JSpinner(new SpinnerNumberModel(1,1,31,1));
//        s1.setBounds(120, 30, 100, 20);
        s2 = new JSpinner(new SpinnerListModel(days));
//        s2.setBounds(230, 30, 100, 20);
        b1 = new JComboBox(city);
        
//        b1.setBounds(350, 30, 100, 20);
        tf = new JTextField(20);
        tf.setFont(new Font("Segoe Script",Font.BOLD,24));
        tf.setForeground(Color.blue);
        //        tf.setBounds(500,30,150,20);
        
        list.addListSelectionListener(this);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        b1.addActionListener(this);
        this.setLayout(new FlowLayout());
        this.add(b1);
        this.add(s1);
        this.add(s2);
        this.add(new JScrollPane(list));
        this.add(tf);
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText(String.valueOf(list.getSelectedValue()));
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == s1) {
            tf.setText(s1.getValue()+"");
        }
        else
        {
            tf.setText(s2.getValue()+"");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText((String)b1.getSelectedItem());
    }
    
}


public class JSpinner_practice {
    public static void main(String[] args) {        
        mySppiner m = new mySppiner();
        m.setSize(800,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
