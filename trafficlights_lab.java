import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class trafficlights_lab extends JPanel implements ActionListener{
    static JFrame f;
    static JRadioButton b1,b2,b3;
    int x=0;
    public static void main(String [] args){
        Traffic t=new Traffic();
        f=new JFrame();
        b1=new JRadioButton("Red");
        b2=new JRadioButton("Yellow");
        b3=new JRadioButton("Green");
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        b1.setBounds(10,10,70,20);
        b2.setBounds(10,30,80,20);
        b3.setBounds(10,50,70,20);
        b1.addActionListener(t);
        b2.addActionListener(t);
        b3.addActionListener(t);
        f.add(b1);f.add(b2);f.add(b3);
        f.add(t);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            x=1;
        }
        else if(ae.getSource()==b2){
            x=2;
        }
        else if(ae.getSource()==b3){
            x=3;
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(100, 110, 110, 270);
        g.setColor(Color.BLACK);
        g.fillRect(100,110,110,270);
        g.drawOval(125, 150, 60, 60);
        g.drawOval(125, 230, 60, 60);
        g.drawOval(125, 300, 60, 60);
        g.setColor(Color.WHITE);
        g.fillOval(125, 150, 60, 60);
        g.fillOval(125, 230, 60, 60);
        g.fillOval(125, 300, 60, 60);
        f.repaint();
        if (x==1){
            g.setColor(Color.RED);
            g.fillOval(125, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(125, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(125, 300, 60, 60);        
        }
        else if (x==2){
            g.setColor(Color.WHITE);
            g.fillOval(125, 150, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(125, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(125, 300, 60, 60);
           
        }
        else if(x==3){
            g.setColor(Color.WHITE);
            g.fillOval(125, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(125, 230, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(125, 300, 60, 60);
          
        }
    }
}
