package DemoTextLabeledBox;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextLabeledBox extends JTextField implements KeyListener
{
	private String content , initContent;
	JLabel textLabel;
	
	public TextLabeledBox(String s)
	{		
		this.initContent = s;
		textLabel = new JLabel(initContent);	
		this.setLayout(new GridLayout(1,1));
		this.setPreferredSize(new Dimension(100, 20));	
		this.add(textLabel);
		this.addKeyListener(this);
	}	
	@Override
	public void keyReleased(KeyEvent e) 
	{	
		content = this.getText();
		if(content.equals(""))
		{
			textLabel.setText(initContent);
		}
		else
		textLabel.setText("");
	}	
	@Override
	public void keyPressed(KeyEvent e) 
	{}
	@Override
	public void keyTyped(KeyEvent e) 
	{}	
}
