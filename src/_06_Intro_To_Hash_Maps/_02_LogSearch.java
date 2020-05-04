package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {

//	 // Crate a HashMap of Integers for the keys and Strings for the values.
	HashMap<Integer, String> log = new HashMap<Integer, String>();

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();

	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.setup();
	}

	void setup() {
		jf.add(jp);
		jf.setVisible(true);

		jp.add(jb);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);

		jb.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb.setText("Add Entry");
		jb1.setText("Search by ID");
		jb2.setText("View List");
		jb3.setText("Remove Entry");

//	  Create a GUI with three buttons. 
//	  Button 1: Add Entry
//	  				When this button is clicked, use an input dialog to ask the user to enter an ID number.
//	  				After an ID is entered, use another input dialog to ask the user to enter a name.
//	  				Add this information as a new entry to your HashMap.
//	  
//	  Button 2: Search by ID
//	  				When this button is clicked, use an input dialog to ask the user to enter an ID number.
//	  				If that ID exists, display that name to the user.
//	  				Otherwise, tell the user that that entry does not exist.
//	  
//	  Button 3: View List
//	  				When this button is clicked, display the entire list in a message dialog in the following format:
//	 				ID: 123  Name: Harry Howard
//	  				ID: 245  Name: Polly Powers
//	  				ID: 433  Name: Oliver Ortega
//	  				etc...
//	  
//	  When this is complete, add a fourth button to your window.
//	  Button 4: Remove Entry
//	  				When this button is clicked, prompt the user to enter an ID using an input dialog.
//	  				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
//	  				is not in the list. 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource() == jb) {
			String id = JOptionPane.showInputDialog("Enter your ID number");
			int idnum = Integer.parseInt(id);
			String name = JOptionPane.showInputDialog("Enter your name");
			log.put(idnum, name);
		}

		else if (e.getSource() == jb1) {
			String id = JOptionPane.showInputDialog("Enter an ID number");
			int idnum = Integer.parseInt(id);
			if (log.containsKey(idnum)) {
				JOptionPane.showMessageDialog(null, log.get(idnum));
			} else {
				JOptionPane.showMessageDialog(null, "This ID does not exist");
			}
		}

		else if (e.getSource() == jb2) {
			for (Integer key : log.keySet()) {
				System.out.println("ID: "+ key + " Name: "+ log.get(key));	
			}
			
		}

		else if (e.getSource() == jb3) {
			String id = JOptionPane.showInputDialog("Enter an ID number");
			int idnum = Integer.parseInt(id);
			if (log.containsKey(idnum)) {
				log.remove(idnum);
			}else {
				JOptionPane.showMessageDialog(null, "This ID does not exist");
			}
		}

	}
}
