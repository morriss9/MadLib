package Project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JSeparator;

public class MadLib extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	JTextArea html;
	
	String name;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MadLib frame = new MadLib();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MadLib() {
		setForeground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 619);
		contentPane =  new JPanel();
		contentPane.setForeground(UIManager.getColor("Menu.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMadLib = new JLabel("Mad Lib ");
		lblMadLib.setFont(new Font("AR HERMANN", Font.PLAIN, 90));
		lblMadLib.setBounds(64, 16, 395, 137);
		contentPane.add(lblMadLib);
		
		JLabel lblNewLabel = new JLabel("Enter a verb \"-ing\"");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(68, 441, 300, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a noun");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(68, 296, 300, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an adjective");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(68, 325, 300, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter a verb");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(68, 354, 300, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter a number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(68, 383, 300, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter an adjective ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(68, 412, 300, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter your name");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(68, 166, 300, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter a food item");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(68, 230, 300, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter an adjective");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(68, 198, 322, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Enter a noun");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(68, 265, 322, 16);
		contentPane.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(208, 163, 189, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(208, 195, 189, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(208, 227, 189, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBounds(208, 261, 189, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(208, 293, 189, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setBounds(208, 325, 189, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setBounds(208, 354, 189, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setBounds(208, 383, 189, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setBounds(208, 412, 189, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(208, 439, 189, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
	
		//creates button to form report	
		JButton btnNewButton = new JButton("Lib It!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//gets text from text fields user input
				String name= textField.getText(); 
				String str1= textField_1.getText(); 
				String str2= textField_2.getText(); 
				String str3= textField_3.getText(); 
				String str4= textField_4.getText(); 
				String str5= textField_5.getText(); 
				String str6= textField_6.getText(); 
				String str7= textField_7.getText();
				String str8= textField_8.getText();
				String str9= textField_9.getText();
				
				
				//removes all components from panel and starts over
				contentPane.removeAll();
				
				//creates heading in HTML and converts to string 		
				StringBuilder htmlBuilder = new StringBuilder();
				htmlBuilder.append("<html>");
				htmlBuilder.append("<body>");
				htmlBuilder.append("<h5><font size=3>To: "+name+"@Yahoo.com</font></h5>");
				htmlBuilder.append("<h5><font size=3>From: Sarah@Gmail.com</font></h5>");
				htmlBuilder.append("</body>");
				htmlBuilder.append("</html>");
				String heading = htmlBuilder.toString();
				
				//assigns heading to label
				JLabel lblNewLabel = new JLabel(heading);
				lblNewLabel.setBounds(38, 30, 222, 100);
				contentPane.add(lblNewLabel);
				
				
				//creates heading in HTML and converts to string 		
				StringBuilder htmlBuilder1 = new StringBuilder();
				htmlBuilder1.append("<html>");
				htmlBuilder1.append("<body>");
				htmlBuilder1.append("<h1><font size=6>Subject: College</font></h1>");
				htmlBuilder1.append("</body>");
				htmlBuilder1.append("</html>");
				String title = htmlBuilder1.toString();
				
				//assigns title to label
				JLabel lblNewLabel1 = new JLabel(title);
				lblNewLabel1.setBounds(38, 120, 222, 100);
				contentPane.add(lblNewLabel1);
				
				
				//creates story in HTML and converts to string 
				StringBuilder htmlBuilder2 = new StringBuilder();
				htmlBuilder2.append("<html>");
				htmlBuilder2.append("<body>");
				htmlBuilder2.append("<p>One day my friends and I decided to take a trip to the beach. "
						+ "I packed a "+str1+" "+str2+" and a big "+str3+". I also brought a towel with a "
						+ "picture of "+str4+" on it. The beach was very crowded but there were a few "
						+ ""+str5+" spots left. We wanted to learn to surf but decided to "+str6+" "
						+ "instead. The temperature was around "+str7+" degrees all day long. When we got back home,"
						+ " I was so "+str8+" and right away I went "+str9+".</p>");
				htmlBuilder2.append("</body>");
				htmlBuilder2.append("</html>");
				String story = htmlBuilder2.toString();
				
				//assigns heading to label
				JLabel lblNewLabel2 = new JLabel(story);
				lblNewLabel2.setBounds(38, 80, 600, 400);
				contentPane.add(lblNewLabel2);
				
				
				//creates heading in HTML and converts to string 		
				StringBuilder htmlBuilder3 = new StringBuilder();
				htmlBuilder3.append("<html>");
				htmlBuilder3.append("<body>");
				htmlBuilder3.append("<h4>Friends who went on the trip with you:</h4>");
				htmlBuilder3.append("<ol><li>Tom</li><li>Holly</li><li>Alex</li></ol>");
				htmlBuilder3.append("</body>");
				htmlBuilder3.append("</html>");
				String list = htmlBuilder3.toString();
				
				//assigns heading to label
				JLabel lblNewLabel3 = new JLabel(list);
				lblNewLabel3.setBounds(38, 270, 600, 400);
				contentPane.add(lblNewLabel3);
				
				
				//adds horizontal lines to separate the page
				JSeparator separator = new JSeparator();
				separator.setBounds(12, 131, 819, 2);
				contentPane.add(separator);
				JSeparator separator1 = new JSeparator();
				separator1.setBounds(12, 390, 819, 2);
				contentPane.add(separator1);
				
				
				//repaints the panel with new components and color
				contentPane.setBackground(Color.pink);
				contentPane.repaint();
			}
			
		});
		
		btnNewButton.setFont(new Font("AR ESSENCE", Font.PLAIN, 40));
		btnNewButton.setBounds(589, 412, 235, 115);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 131, 819, 2);
		contentPane.add(separator);
		
		
	}
}
