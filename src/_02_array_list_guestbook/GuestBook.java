package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	ArrayList <String> names = new ArrayList <String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public void run() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		add = new JButton("Add Name");
		add.addActionListener(this);
		panel.add(add);
		view = new JButton("View Names");
		view.addActionListener(this);
		panel.add(view);
		frame.pack();
		frame.setVisible(true);

		
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			String nameInput = JOptionPane.showInputDialog("Enter a name");
			names.add(nameInput);
		}
		else if (e.getSource()==view) {
			JOptionPane.showMessageDialog(null, names);
		}
	}
}
