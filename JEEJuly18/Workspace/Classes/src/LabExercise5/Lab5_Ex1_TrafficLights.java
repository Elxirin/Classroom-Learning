package LabExercise5;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab5_Ex1_TrafficLights extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Frame frame;
	CheckboxGroup cbg;
	Checkbox cb1, cb2, cb3;
	//Dialog d = new Dialog(f, "Status", true);
	Label l1 = new Label("Stop");
	Label l2 = new Label("Ready");
	Label l3 = new Label("Go");

	public Lab5_Ex1_TrafficLights() {
		//f = new Frame("Traffic Lights");
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("", cbg, false);
		cb2 = new Checkbox("", cbg, false);
		cb3 = new Checkbox("", cbg, false);
		cb1.setBounds(100, 100, 50, 50);
		cb1.setBackground(Color.RED);
		cb2.setBounds(100, 150, 50, 50);
		cb2.setBackground(Color.YELLOW);
		cb3.setBounds(100, 200, 50, 50);
		cb3.setBackground(Color.GREEN);

		Handle_ItemListener handle_ItemListener = new Handle_ItemListener();
		cb1.addItemListener(handle_ItemListener);
		cb2.addItemListener(handle_ItemListener);
		cb3.addItemListener(handle_ItemListener);
		
		add(cb1);
		add(cb2);
		add(cb3);
		setSize(400, 400);
		//setLayout(null);
		setVisible(true);

	/*	f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		d.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});*/
	}

	public static void main(String[] args) {
		frame = new Frame();
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setLayout(new FlowLayout());
		frame.add(new Lab5_Ex1_TrafficLights());
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	private class ColorDialog extends Dialog {

		public ColorDialog(String color) {
			super(new Frame());
			if(color.equals("Red")) {
				add(l1);
				setSize(200, 200);
				setLayout(new FlowLayout());
				setVisible(true);
			}
			if(color.equals("Yellow")) {
				add(l2);
				setSize(200, 200);
				setLayout(new FlowLayout());
				setVisible(true);
			}
			if(color.equals("Green")) {
				add(l3);
				setSize(200, 200);
				setLayout(new FlowLayout());
				setVisible(true);
			}
		}
		
	}
	
	private class Handle_ItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == cb1) {
				System.out.println("Stop");
				new ColorDialog("Red");

			}
			if (e.getSource() == cb2) {
				System.out.println("Ready");
				new ColorDialog("Yellow");
			}
			if (e.getSource() == cb3) {
				System.out.println("Go");
				new ColorDialog("Green");
			}

		}
	}

}
