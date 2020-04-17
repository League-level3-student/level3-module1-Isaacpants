package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	ArrayList<String> list = new ArrayList<String>();

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	public static void main(String[] args) {
		_02_GuestBook gb= new _02_GuestBook();
		gb.setup(); 
	}
	 void setup() {
		jf.add(jp);
		jp.add(jb);
		jp.add(jb1);
		jf.setVisible(true);
		jb.addActionListener(this);
		jb1.addActionListener(this);
	
		jb.setText("Add Name");
		jb1.setText("View Names");
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
	
		
	
		if(e.getSource().equals(jb)) {
		String name = JOptionPane.showInputDialog("What is the name");
		list.add(name);
		
		
		}
		for (int i = 0; i < list.size(); i++) {
			
		
		
		if(e.getSource().equals(jb1)) {
			//JOptionPane.showMessageDialog(null, "Guest #"+ (i+1) +": "+list.get(i));
			String result = "";
			 result += "Guest #" + (i+1) + ": " + list.get(i);
			JOptionPane.showMessageDialog(null, result);
			
			}
		}
	}

	
	
}
