import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 */

/**
 * @author 1951268
 *
 */
public class ContactFrame extends JFrame implements ActionListener{

	private JLabel lblTitle = new JLabel("Please Select One");
	
	private JTextField fldName1 = new JTextField(15);
	private JTextField fldName2 = new JTextField(15);
	private JTextField fldPCode = new JTextField(15);
	private JTextField fldStreet =new JTextField(15);
	private JTextField fldCity = new JTextField(15);
	private JTextField fldProvince = new JTextField(15);
	private JTextField fldEmail= new JTextField(15);
	private JTextField fldPhone= new JTextField(15);
	
	
	private JButton btnPersonal = new JButton("Create New Personal Contact");
	private JButton btnBusiness = new JButton("Create New Business Contact");
	private JButton btnClear = new JButton("Clear");
	private JButton btnAdd = new JButton("Add");
	private JPanel ButtonPanel = new JPanel();
	private JPanel BannerPanel = new JPanel();
	private JPanel PersonalPanel = new JPanel();
	private JPanel LabelPanel = new JPanel();
	private final JLabel lblFirstName = new JLabel("First Name:");
	private final JLabel lblLastName = new JLabel("Last Name:");
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth:");
	private final JLabel lblNewLabel = new JLabel("Street:");
	private final JLabel lblNewLabel_1 = new JLabel("City:");
	private final JLabel lblPostalCode = new JLabel("Postal Code:");
	private final JTextField textField = new JTextField();
	private final JComboBox comboBox = new JComboBox();
	private final JLabel lblPhoneNumber = new JLabel("Phone Number");
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JLabel lblCell = new JLabel("Cell:");
	private final JLabel lblHome = new JLabel("Home:");
	private final JLabel lblNewLabel_2 = new JLabel("Twitter:");
	private final JLabel lblInstagram = new JLabel("Instagram:");
	private final JLabel lblRelationship = new JLabel("Relationship");
	private final JTextField textField_3 = new JTextField();
	private final JTextField textField_4 = new JTextField();
	private final JTextField textField_5 = new JTextField();
	
	public ContactFrame() {
		textField_1.setBounds(144, 226, 153, 20);
		textField_1.setColumns(10);
		textField.setBounds(143, 168, 59, 20);
		textField.setColumns(10);
		PersonalPanel.setBounds(0, 24, 434, 442);
		PersonalPanel.setLayout(null);
		BannerPanel.setBounds(0, 0, 434, 24);

		
		BannerPanel.add(lblTitle);
		ButtonPanel.setBounds(0, 467, 434, 33);
		ButtonPanel.setLayout(null);
		btnPersonal.setBounds(10, 5, 204, 23);
		ButtonPanel.add(btnPersonal);
		btnBusiness.setBounds(219, 5, 205, 23);
		ButtonPanel.add(btnBusiness);
		getContentPane().setLayout(null);
		
		getContentPane().add(BannerPanel);
		getContentPane().add(ButtonPanel);
		
		btnPersonal.addActionListener(this);
		btnBusiness.addActionListener(this);
		getContentPane().add(PersonalPanel);
		fldStreet.setBounds(144, 106, 222, 20);
		PersonalPanel.add(fldStreet);
		fldPCode.setBounds(144, 137, 137, 20);
		PersonalPanel.add(fldPCode);
		fldName1.setBounds(144, 11, 222, 20);
		PersonalPanel.add(fldName1);
		fldName2.setBounds(144, 42, 222, 20);
		PersonalPanel.add(fldName2);
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(46, 14, 88, 14);
		
		PersonalPanel.add(lblFirstName);
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(46, 45, 88, 14);
		
		PersonalPanel.add(lblLastName);
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateOfBirth.setBounds(46, 77, 88, 14);
		
		PersonalPanel.add(lblDateOfBirth);
		
		JComboBox cmbxDay = new JComboBox();
		cmbxDay.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cmbxDay.setBounds(144, 73, 54, 22);
		PersonalPanel.add(cmbxDay);
		
		JComboBox cmbxMonth = new JComboBox();
		cmbxMonth.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		cmbxMonth.setBounds(208, 73, 89, 22);
		PersonalPanel.add(cmbxMonth);
		
		JComboBox cmbxYear = new JComboBox();
		cmbxYear.setModel(new DefaultComboBoxModel(new String[] {"Year", "1950"}));
		cmbxYear.setBounds(307, 73, 59, 22);
		PersonalPanel.add(cmbxYear);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(86, 109, 48, 14);
		
		PersonalPanel.add(lblNewLabel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(86, 140, 48, 14);
		
		PersonalPanel.add(lblNewLabel_1);
		lblPostalCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPostalCode.setBounds(58, 171, 75, 14);
		
		PersonalPanel.add(lblPostalCode);
		
		PersonalPanel.add(textField);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Province"}));
		comboBox.setBounds(291, 137, 75, 22);
		
		PersonalPanel.add(comboBox);
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNumber.setBounds(46, 205, 88, 14);
		
		PersonalPanel.add(lblPhoneNumber);
		
		PersonalPanel.add(textField_1);
		textField_2.setColumns(10);
		textField_2.setBounds(144, 257, 153, 20);
		
		PersonalPanel.add(textField_2);
		lblCell.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCell.setBounds(86, 230, 48, 14);
		
		PersonalPanel.add(lblCell);
		lblHome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHome.setBounds(86, 260, 48, 14);
		
		PersonalPanel.add(lblHome);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(46, 292, 88, 14);
		
		PersonalPanel.add(lblNewLabel_2);
		lblInstagram.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInstagram.setBounds(46, 323, 88, 14);
		
		PersonalPanel.add(lblInstagram);
		lblRelationship.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRelationship.setBounds(46, 354, 88, 14);
		
		PersonalPanel.add(lblRelationship);
		textField_3.setColumns(10);
		textField_3.setBounds(144, 289, 96, 20);
		
		PersonalPanel.add(textField_3);
		textField_4.setColumns(10);
		textField_4.setBounds(144, 320, 96, 20);
		
		PersonalPanel.add(textField_4);
		textField_5.setColumns(10);
		textField_5.setBounds(144, 351, 68, 20);
		
		PersonalPanel.add(textField_5);
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == btnPersonal) {
			lblTitle.setText("Add New Personal Contact");
			getContentPane().add(LabelPanel,BorderLayout.WEST);
			ButtonPanel.removeAll();
			ButtonPanel.add(btnClear);
			ButtonPanel.add(btnAdd);
			revalidate();
			setSize(500,300);
		}
		if(event.getSource() == btnBusiness) {
			
		}
	}
	
	public static void main(String[] args) {
		ContactFrame frame = new ContactFrame();
		frame.setTitle("Contact List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
