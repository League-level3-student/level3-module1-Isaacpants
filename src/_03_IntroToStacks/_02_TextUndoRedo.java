package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	String letter = " ";
	Stack<String> deleted = new Stack<String>();
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	public static void main(String[] args) {
		_02_TextUndoRedo tur= new _02_TextUndoRedo();
		tur.setup();
	}void setup(){
		
	
		
		jf.add(jp);
		jf.setVisible(true);
		
		jp.add(jl);
		
		jf.addKeyListener(this);
		
		

		
		
		
		
		
		jf.pack();
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
if(letter.length()==0) {
	letter+="There is nothing left ";
}else {

if(e.getKeyChar()=='\b') {
	deleted.push(letter.charAt(letter.length()-1)+"");
	letter= letter.substring(0, letter.length()-1);
	
}else {
	 letter += e.getKeyChar();
	 }
if(e.getKeyCode()==10) {
	letter+= deleted.pop();
	
}
System.out.println(letter);
jl.setText(letter);
jf.pack();
}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	 
//	  Create a JFrame with a JPanel and a JLabel.
//	  
//	  Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
//	  
//	  Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
//	  Save that deleted character onto a Stack of Characters.
//	  
//	  Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
//	  off the Stack and added back to the JLabel.
//	  
	  
	
	
	
	
}
