
	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.GridLayout;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class TikTak {
		public static JButton[][] buttons = new JButton[5][5];

		public TikTak(){
			
		
		JFrame frame = new JFrame("tik-tak-tow");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[0].length; j++) {
	            buttons[i][j]=new JButton(" ");
	            buttons[i][j].setActionCommand("n"+i+"n"+j);
	        	Controller c= new Controller(buttons[i][j]);
	            buttons[i][j].addActionListener(c);
	            panel.add(buttons[i][j]);
			}

		}
		panel.setLayout(new GridLayout(5, 5, 5, 5));

		
		JTextField result = new JTextField("Its Player X turn");
		Controller c2= new Controller(result);
		result.addActionListener(c2);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(result, BorderLayout.SOUTH);
		frame.pack();

		frame.setMinimumSize(new Dimension(400, 400));;
		
		}
		
		public static void main(String[] args)
		{
			TikTak k = new TikTak();
		}
		
	
}
