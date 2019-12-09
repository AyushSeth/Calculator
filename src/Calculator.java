
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;

public class Calculator {
	JFrame main_frame=new JFrame("Calculator");
	JFrame f=new JFrame("ERROR");
	JPanel a=new JPanel();
	JPanel main_panel=new JPanel();
	JTextArea area=new JTextArea();
	String number="";
	double b=-1,d=-1,result;
	int index=0;
	int operator;
	//JTextField area=new JTextField(42);
	Calculator(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	//area.setFont(new Font("Helvetica Neue", Font.PLAIN, 50));
	area.setSize(50,50);
	//area.setLocation(110, 20);
	//area.setBackground(new Color(11111));
	//area.set;
	//a.add(area);
	a.add(area);
	a.setSize(500,100);
	a.setLayout(new GridLayout(1,1));
	main_frame.add(a,"North");
	//main_frame.add(a);

	JButton b1=new JButton("1");b1.setSize(50, 50);b1.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b1);
	JButton b2=new JButton("2");b2.setSize(50, 50);b2.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b2);
	JButton b3=new JButton("3");b3.setSize(50, 50);b3.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b3);
	JButton ba=new JButton("+");b3.setSize(50, 50);ba.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(ba);
	JButton b4=new JButton("4");b4.setSize(50, 50);b4.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b4);
	JButton b5=new JButton("5");b5.setSize(50, 50);b5.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b5);
	JButton b6=new JButton("6");b6.setSize(50, 50);b6.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b6);
	JButton bs=new JButton("-");b3.setSize(50, 50);bs.setFont(new Font("Monaco", Font.PLAIN, 35));main_panel.add(bs);
	JButton b7=new JButton("7");b7.setSize(50, 50);b7.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b7);
	JButton b8=new JButton("8");b8.setSize(50, 50);b8.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b8);
	JButton b9=new JButton("9");b9.setSize(50, 50);b9.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b9);
	JButton bd=new JButton("/");b3.setSize(50, 50);bd.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(bd);
	JButton b14=new JButton(".");b14.setSize(50, 50);b14.setFont(new Font("Monaco", Font.PLAIN, 35));main_panel.add(b14);
	JButton b11=new JButton("0");b11.setSize(50, 50);b11.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b11);	
	JButton b10=new JButton("=");b10.setSize(50, 50);b10.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b10);
	JButton bm=new JButton("*");b3.setSize(50, 50);bm.setFont(new Font("Monaco", Font.PLAIN, 35));main_panel.add(bm);
	JButton b12=new JButton("C");b12.setSize(150,150);b12.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b12);
	JButton b13=new JButton("del");b13.setSize(50, 50);b13.setFont(new Font("Monaco", Font.PLAIN, 25));main_panel.add(b13);

	
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			area.setText("1");
			number=number+area.getText();
			area.setText(number);
			area.setFont(new Font("Monaco", Font.PLAIN, 50));
		}
	});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			area.setText("2");
			number=number+area.getText();
			area.setText(number);
			area.setFont(new Font("Monaco", Font.PLAIN, 50));
		}
	});
	b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("3");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("4");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("5");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("6");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("7");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b8.addActionListener(new ActionListener() {
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("8");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("9");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	b11.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("0");
		number=number+area.getText();
		area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	
	b12.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area.setText("");
		number=area.getText();
		area.setText(number);
		number="";
		area.setFont(new Font("Monaco", Font.PLAIN, 50));
	}
	});
	
	b13.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String new_number ="";
			for(int i=0;i<number.length()-1;i++)
			{
				new_number=new_number+number.charAt(i);
			}
			number=new_number;
			area.setText(number);
		}
	});
	
	
	b14.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			area.setText(".");
			number=number+area.getText();
			area.setText(number);
			area.setFont(new Font("Monaco", Font.PLAIN, 50));
		}
	});
	
	
	ba.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//area.setText("+");
		//number=number+area.getText();
		/*area.setText(number);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		if(number.length()<=0||number=="") {JOptionPane.showMessageDialog(f,"Enter The number First");}
		else if(number.length()>=13){JOptionPane.showMessageDialog(f,"The number is to too long");}else{
		b=Double.parseDouble(number);
		number="";
		area.setText("");
		operator=1;
		//area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));}
	}
	});

	bs.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(number.length()<=0||number=="") {JOptionPane.showMessageDialog(f,"Enter The number First");}
		else  if(number.length()>=13){JOptionPane.showMessageDialog(f,"The number is to too long");}else{
		b=Double.parseDouble(number);
		number="";
		area.setText("");
		operator=2;
		//area.setText("-");
		//number=number+area.getText();
		//area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));}
	}
	});
	bd.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(number.length()<=0||number=="") {JOptionPane.showMessageDialog(f,"Enter The number First");}
		else  if(number.length()>=13){JOptionPane.showMessageDialog(f,"The number is to too long");}else{
		b=Double.parseDouble(number);
		number="";
		area.setText("");
		operator=3;
		//area.setText("/");
		//number=number+area.getText();
		//area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));}
	}
	});
	bm.addActionListener(new ActionListener() {
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(number.length()<=0||number=="") {JOptionPane.showMessageDialog(f,"Enter The number First");}
		else  if(number.length()>=13){JOptionPane.showMessageDialog(f,"The number is to too long");}else{
		b=Double.parseDouble(number);
		number="";
		area.setText("");
		operator=4;
		//area.setText("*");
		//number=number+area.getText();
		//area.setText(number);
		area.setFont(new Font("Monaco", Font.PLAIN, 50));}
	}
	});
	b10.addActionListener(new ActionListener() {
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		number=area.getText();
		//System.out.println(number);
		/*if((!number.contains("*"))&&(!number.contains("+"))&&(!number.contains("/"))&&(!number.contains("-")))
		{number="Do Some Operations";area.setText(number);area.setFont(new Font("Monaco", Font.PLAIN, 20));System.out.print("Do Some Operations");}
		else //if(number.contains("*")||number.contains("/"))
		{*/
		
		if(b==-1) {JOptionPane.showMessageDialog(f,"Enter The number First");}else if(number.length()<=0||number=="") {
			JOptionPane.showMessageDialog(f,"Enter The number First");}else {
				d=Double.parseDouble(number);
			//System.out.println("d="+d);
			switch(operator)
			{
			case 1:result=b+d;break;
			case 2:result=b-d;break;
			case 3:result=b/d;break;
			case 4:result=b*d;break;
			}
			//area.setText("");
			number=Double.toString(result);
			area.setText(number);
			area.setFont(new Font("Monaco", Font.PLAIN, 50));
		}
			/*if(number.contains("*")) 
				{
					int loc=number.indexOf("*");int loc_add=0;int loc_sub=0;
					int length_String=number.length();
					if(number.contains("+")||number.contains("-"))
						{
						if(number.contains("+"))
							{
								loc_add=number.indexOf("+");
							}
						if(number.contains("-"))
							{
								loc_sub=number.indexOf("-");
							}
						if(loc_add>=loc_sub) {index=loc_add;}else {index=loc_sub;}
						}
					for(int i=index;i<loc;i++)
						{}
					for(int i=loc+1;i<loc;i++)
						{}
				}
			if(number.contains("/"))
				{
				int loc=number.indexOf("*");
				int length_String=number.length();
				if(number.contains("+")||number.contains("-"))
					{
						
					}
				else
					{
					
					}
				}
*/		//}
	}
	});
		
	main_panel.setLayout(new GridLayout(5,1));

	//main_frame.add(a);
	main_frame.add(main_panel,"Center");
	main_frame.setLocation(650,250);
	main_frame.setSize(500,525);
	main_frame.setVisible(true);
	
	}
	
	public static void main(String args[]){
		Calculator cal=new Calculator();
	
	}
}