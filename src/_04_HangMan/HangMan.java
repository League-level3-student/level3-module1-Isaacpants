package _04_HangMan;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	int lives= 10;
	String newWord = "";
	String jl1 = "";
	String key = "";
	
	Stack<String> words = new Stack<String>();
	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.setup();
		
	}void blankSpaces(){
		jl1="";
for (int i = 0; i < newWord.length(); i++) {
			
			jl1+="_";
			jl.setText(jl1);
			
		}
JOptionPane.showMessageDialog(null, "there are "+newWord.length()+" letters");
	}
	
	void setup() {
		jf.add(jp);
		jf.setVisible(true);
		
		jp.add(jl);
		

		jf.addKeyListener(this);
		
		//Utilities u = new Utilities();
	
	String letternum = JOptionPane.showInputDialog("Give me a number between 1 and "+Utilities.getTotalWordsInFile("dictionary.txt"));
		int num = Integer.parseInt(letternum);
		for (int i = 0; i < num; i++) {
			newWord = Utilities.readRandomLineFromFile("dictionary.txt");
			//words.push(newWord);
			while(words.contains(newWord)) {
			newWord = Utilities.readRandomLineFromFile("dictionary.txt");	
			
			}
			
		words.push(newWord);
	//	JOptionPane.showMessageDialog(null, newWord);	
		System.out.println(newWord);
		}
		
		
		newWord=words.pop();
		blankSpaces();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String word="";
		String text=jl.getText();
		System.out.println(text);
		
		for (int i = 0; i < newWord.length(); i++) {
			if(e.getKeyChar()==newWord.charAt(i)) {
				word+=e.getKeyChar();
				
			}else {
				word+=text.charAt(i);
				
			}
			
		}
		jl.setText(word);
		if(!text.contains("_")) {
			JOptionPane.showMessageDialog(null, "You Win!");
			if(!words.isEmpty()) {
				newWord=words.pop();
				blankSpaces();
			}
			
			lives=11;
		}
		System.out.println(word);
		
		
		if(lives<=0) {
			JOptionPane.showMessageDialog(null, "Game Over");
		}
		
		if(newWord.contains(e.getKeyChar()+"")) {
			JOptionPane.showMessageDialog(null, "works");
	
		
		}else {
		lives--;
		JOptionPane.showMessageDialog(null,"You Have " +lives + " lives left");
		}
		jf.pack();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
