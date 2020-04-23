package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	ArrayList<String> songs = new ArrayList<String>();
	
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
			songs.add("demo.mp3");
			songs.add("demo2.mp3");
				jf.setVisible(true);
				jf.add(jp);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				jp.add(jb);
				jb.setText("Surprise Me");
				
				jb.addActionListener(this);
				
				jf.pack();
				 
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	
		
		if(e.getSource().equals(jb)) {
			Random rand = new Random();
			int random = rand.nextInt(2);
			Song s = new Song(songs.get(random));
			s.play();
		
			
		}
	}
}