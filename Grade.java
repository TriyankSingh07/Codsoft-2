package demo3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent ;
public class Grade {
	public static JFrame f;
	public static JLabel l1,l2,l3,l4,l5,l6;
	public static JTextField t1,t2,t3,t4,t5,t6;
	public static JButton b1;
	public static int totalMarks;
	public static double percentage;
	public static char grade;
	 Grade(){
			f=new JFrame("Grade");
			f.setSize(400,350);
			f.setLocationRelativeTo(null);
			f.setLayout(null);
			
			l1=new JLabel("Subject 1");
			l1.setBounds(30,40,200,20);
			f.add(l1);
			
			t1 = new JTextField();
		    t1.setBounds(150,40,120,20);
		    f.add(t1);
		    
		    l2=new JLabel("Subject 2");
			l2.setBounds(30,80,200,20);
			f.add(l2);
			
			t2 = new JTextField();
		    t2.setBounds(150,80,120,20);
		    f.add(t2);
		    
		    l3=new JLabel("Subject 3");
			l3.setBounds(30,120,200,20);
			f.add(l3);
			
			t3 = new JTextField();
		    t3.setBounds(150,120,120,20);
		    f.add(t3);
		    
		    l4=new JLabel("Subject 4");
			l4.setBounds(30,160,200,20);
			f.add(l4);
			
			t4 = new JTextField();
		    t4.setBounds(150,160,120,20);
		    f.add(t4);
		    
		    l4=new JLabel("Subject 5");
			l4.setBounds(30,200,200,20);
			f.add(l4);
			
			t5 = new JTextField();
		    t5.setBounds(150,200,120,20);
		    f.add(t5);
		    
		    b1=new JButton("Calculate");
		    b1.setBounds(160,260,100,30);
		    f.add(b1);
		    
		    b1.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		f.dispose();
		    		m1();
		    	}
		    });
		    
		    
		    f.setVisible(true);
	 }
	 
	 public static void m1() {
		    try {
		        int Subject1 = Integer.parseInt(t1.getText());
		        int Subject2 = Integer.parseInt(t2.getText());
		        int Subject3 = Integer.parseInt(t3.getText());
		        int Subject4 = Integer.parseInt(t4.getText());
		        int Subject5 = Integer.parseInt(t5.getText());

		        totalMarks = Subject1 + Subject2 + Subject3 + Subject4 + Subject5;
		        percentage = (totalMarks * 100) / 500;

		        if (percentage >= 90) {
		            grade = 'A';
		        } else if (percentage >= 80) {
		            grade = 'B';
		        } else if (percentage >= 70) {
		            grade = 'C';
		        } else if (percentage >= 60) {
		            grade = 'D';
		        } else if (percentage >= 50) {
		            grade = 'E';
		        } else {
		            grade = 'F';
		        }

		        new Grad2();
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(f, "Please enter valid numbers in all fields.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
		    }
		}

	 

	public static void main(String[] args) {
		new Grade();
	}

}
