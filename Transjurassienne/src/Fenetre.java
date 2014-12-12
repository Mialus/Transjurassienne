package transjurassienne;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Fenetre extends JFrame implements ActionListener {
    
    	JTextField operand = new JTextField();
	JLabel result = new JLabel();
        JButton[] jButtons;
        
        	public void actionPerformed(ActionEvent e)
	{
		int k = 0;
		while (jButtons[k++] != e.getSource());
		System.out.println("click on JButton " + k);
	}

	
	private void afficheCarre()
	{
		try
		{
			int k = Integer.parseInt(operand.getText());
			k *= k;
			result.setText(Integer.toString(k));
		} 
		catch (Exception ex)
		{
			System.out.println(ex);
			if (result != null)
				result.setText("");
		}
	}
	
	private KeyListener getKeyListener()
	{
		return new KeyAdapter()
		{
			public void keyReleased(KeyEvent e)
			{
				afficheCarre();
			}			
		};
	}
        
    	private JPanel getMainPanel()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(new JLabel("x = "));
		operand.addKeyListener(getKeyListener());
		panel.add(operand);
		panel.add(new JLabel("x^2 = "));
		panel.add(result);
		return panel;		
	}
        
        
	public Fenetre(){
		JFrame frame = new JFrame();
		jButtons = new JButton[3];
		frame.setTitle("My third window !");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		jButtons[0] = new JButton("my First JButton");
		jButtons[1] = new JButton("my Second JButton");
		jButtons[2] = new JButton("my Third JButton");
		for (int i = 0; i < 3; i++)
		{
			frame.getContentPane().add(jButtons[i]);
			jButtons[i].addActionListener(this);
		}
		frame.setVisible(true);
		frame.pack();
	}

public static void main(String[] args){
 Fenetre f=new Fenetre();
 f.setVisible(true);
//System.exit(0);
}
}