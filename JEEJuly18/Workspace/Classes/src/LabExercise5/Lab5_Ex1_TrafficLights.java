package LabExercise5;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Lab5_Ex1_TrafficLights extends Frame implements ItemListener, WindowListener {
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3;
	Frame f;
	public Lab5_Ex1_TrafficLights() {
		f = new Frame("Traffic Lights");
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("",cbg,false);
		cb2 = new Checkbox("",cbg,false);
		cb3 = new Checkbox("",cbg,false);
		cb1.setBounds(100,100,50,50);
		cb1.setBackground(Color.RED);
		cb2.setBounds(100,150,50,50);
		cb2.setBackground(Color.YELLOW);
		cb3.setBounds(100,200,50,50);
		cb3.setBackground(Color.GREEN);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
	}
	
	public static void main(String[] args) {
		new Lab5_Ex1_TrafficLights();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cb1) {
			Dialog d = new Dialog(f,"Status",true);
			d.add(new Label("Stop"));
			d.setSize(200,200);
			d.setLayout(new FlowLayout());
			d.setVisible(true);
			
		}
		if(e.getSource()==cb2) {
			Dialog d = new Dialog(f,"Status",true);
			d.add(new Label("Ready"));
			d.setSize(200,200);
			d.setLayout(new FlowLayout());
			d.setVisible(true);
		}
		if(e.getSource()==cb3) {
			Dialog d = new Dialog(f,"Status",true);
			d.add(new Label("Go"));
			d.setSize(200,200);
			d.setLayout(new FlowLayout());
			d.setVisible(true);
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}


