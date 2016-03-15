package gui_JCheckBox;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
	
	
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	
	public Gui(){
		
		super("Sondres checkboxprogram");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Dette er en setning", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		tf.setEditable(false);
		boldbox = new JCheckBox("bold checkbox :) ");
		italicbox = new JCheckBox("italix checkbox :) ");
		add(boldbox);
		add(italicbox);
		
		HandlerClass handler = new HandlerClass();
		
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		
	}
	
	private class HandlerClass implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			// TODO Auto-generated method stub
			Font font = null;
			
			if(boldbox.isSelected() && italicbox.isSelected()){
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}else if(boldbox.isSelected()){
				font = new Font("Serif", Font.BOLD, 14);
			}else if(italicbox.isSelected()){
				font = new Font("Serif",Font.ITALIC, 14);
			}else{
				font = new Font("Serif", Font.PLAIN, 14);
			}
			
			tf.setFont(font);
		}
		
	}

		
		
		
	
	
	
	
	

}
