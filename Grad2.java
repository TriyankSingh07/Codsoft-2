package demo3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Grad2 {
	public static JFrame f;
	public static JLabel l1,l2,l3;
	public static JButton b1,b2;
	Grad2(){
		
		f=new JFrame("Result");
		f.setSize(400,350);
		f.setLocationRelativeTo(null);
		
		l1=new JLabel("Total Marks : " + Grade.totalMarks);
		l1.setBounds(30,40,170,20);
		f.add(l1);
				
		l2=new JLabel("Percentage : " + Grade.percentage+"%");
		l2.setBounds(30,90,200,20);
		f.add(l2);
		
		l3=new JLabel("Grade : " +  Grade.grade);
		l3.setBounds(30,140,100,20);
		f.add(l3);
		
		f.setLayout(null);
		
		 b1=new JButton("Back");
		    b1.setBounds(30,200,100,25);		
		    f.add(b1);
	
	 b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new Grade();
				f.dispose();
					
				}
			});

	    b2=new JButton("Exit");
	    b2.setBounds(200,200,100,25);		
	    f.add(b2);

       b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			  f.dispose();
			
			}
		});
	 
	 f.setVisible(true);;
	 
	}
	public static void main(String[] args) {
		new Grad2();
	}
}
