import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.*;
public class ContactListFrame extends JFrame implements ActionListener, WindowListener {

	private Contact contact;
	
	private JTextField fldName1 = new JTextField();
	private JTextField fldName2 = new JTextField();
	private JTextField fldPCode = new JTextField();
	private JTextField fldStreet = new JTextField();
	private JTextField fldWPhone;
	private JTextField fldCompany;
	private JTextField fldDepartment;
	private JTextField fldPosition;
	private JTextField fldEmail;
	private JTextField fldCPhone = new JTextField();
	private JTextField fldTwitter = new JTextField();
	private JTextField fldInstagram = new JTextField();
	private JTextField fldCity = new JTextField();
	private JTextField fldHPhone = new JTextField();
	
	private JButton btnBack = new JButton("Back");
	private JButton btnPersonal = new JButton("Create New Personal Contact");
	private JButton btnBusiness = new JButton("Create New Business Contact");
	private JButton btnClear = new JButton("Clear");
	private JButton btnAdd = new JButton("Add");
	
	private JPanel ButtonPanel = new JPanel();
	private JPanel BannerPanel = new JPanel();
	private JPanel InputPanel = new JPanel();
	private JPanel BusinessPanel = new JPanel();
	
	private JLabel lblTitle = new JLabel("Please Select One");
	private JLabel lblAddress = new JLabel("Address");
	private final JLabel lblFirstName = new JLabel("First Name:");
	private final JLabel lblLastName = new JLabel("Last Name:");
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth:");
	private final JLabel lblStreet = new JLabel("Street:");
	private final JLabel lblCity = new JLabel("City:");
	private final JLabel lblPostalCode = new JLabel("Postal Code:");
	private final JLabel lblSocial = new JLabel("Social");
	private JLabel lblPosition = new JLabel("Position:");
	private JLabel lblCompany = new JLabel("Company:");
	private JLabel lblDepartment = new JLabel("Department:");
	private JLabel lblWPhone = new JLabel("Work:");
	private final JLabel lblPhoneNumber = new JLabel("Phone Number");
	private final JLabel lblCell = new JLabel("Cell:");
	private JLabel lblEmail = new JLabel("Email:");
	private final JLabel lblWork = new JLabel("Work");
	private final JLabel lblContact = new JLabel("Contact");
	private final JPanel PersonalPanel = new JPanel();
	private final JLabel lblHome = new JLabel("Home:");
	private final JLabel lblTwitter = new JLabel("Twitter:");
	private final JLabel lblInstagram = new JLabel("Instagram:");
	private final JLabel lblRelationship = new JLabel("Relationship:");
	
	private final JComboBox cmbxProvince = new JComboBox();
	private JComboBox cmbxYear = new JComboBox();
	private JComboBox cmbxMonth = new JComboBox();
	private JComboBox cmbxDay = new JComboBox();
	private JComboBox cmbxRelationship = new JComboBox();
	
	public ContactListFrame() {
		this.addWindowListener(this);
		Contact.initialize();
		fldCPhone.setBounds(140, 310, 155, 20);
		fldCPhone.setColumns(10);
		fldCity.setBounds(140, 220, 135, 20);
		fldCity.setColumns(10);
		InputPanel.setBounds(0, 0, 450, 340);
		InputPanel.setLayout(null);
		BannerPanel.setBounds(0, 0, 450, 25);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BannerPanel.add(lblTitle);
		ButtonPanel.setBounds(0, 25, 450, 35);
		ButtonPanel.setLayout(null);
		btnPersonal.setBounds(13, 5, 205, 23);
		btnAdd.setBounds(10, 5, 204, 23);
		ButtonPanel.add(btnPersonal);
		btnBusiness.setBounds(231, 5, 205, 23);
		btnClear.setBounds(219, 5, 205, 23);
		ButtonPanel.add(btnBusiness);
		getContentPane().setLayout(null);
		getContentPane().add(BannerPanel);
		getContentPane().add(ButtonPanel);
		btnPersonal.addActionListener(this);
		btnBusiness.addActionListener(this);
		fldStreet.setBounds(140, 190, 220, 20);
		InputPanel.add(fldStreet);
		fldPCode.setBounds(141, 250, 61, 20);
		InputPanel.add(fldPCode);
		fldName2.setBounds(140, 70, 220, 20);
		InputPanel.add(fldName2);
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(45, 43, 80, 15);
		InputPanel.add(lblFirstName);
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(45, 73, 80, 15);
		InputPanel.add(lblLastName);
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateOfBirth.setBounds(45, 103, 80, 15);
		InputPanel.add(lblDateOfBirth);
		cmbxDay.setModel(new DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		cmbxDay.setBounds(140, 100, 55, 20);
		InputPanel.add(cmbxDay);

		cmbxMonth.setModel(new DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April",
				"May", "June", "July", "August", "September", "October", "November", "December" }));
		cmbxMonth.setBounds(205, 100, 90, 20);
		InputPanel.add(cmbxMonth);

		cmbxYear.setModel(new DefaultComboBoxModel(new String[] { "Year", "2016", "2015", "2014", "2013", "2012",
				"2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999",
				"1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986",
				"1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973",
				"1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960",
				"1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947",
				"1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934",
				"1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921",
				"1920", "1919", "1918", "1917", "1916" }));
		cmbxYear.setBounds(305, 100, 55, 20);
		InputPanel.add(cmbxYear);
		lblStreet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStreet.setBounds(45, 193, 80, 15);
		InputPanel.add(lblStreet);
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(45, 223, 80, 15);
		InputPanel.add(lblCity);
		lblPostalCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPostalCode.setBounds(45, 253, 80, 15);
		InputPanel.add(lblPostalCode);
		InputPanel.add(fldCity);
		cmbxProvince.setModel(new DefaultComboBoxModel(new String[] { "Province", "AB", "BC", "MB", "NB", "NL", "NT",
				"NS", "NU", "ON", "PE", "QC", "SK", "YT" }));
		cmbxProvince.setBounds(285, 220, 75, 20);
		InputPanel.add(cmbxProvince);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(140, 280, 220, 20);
		InputPanel.add(lblPhoneNumber);
		InputPanel.add(fldCPhone);
		lblCell.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCell.setBounds(45, 313, 80, 15);
		InputPanel.add(lblCell);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(45, 133, 80, 15);
		InputPanel.add(lblEmail);
		fldEmail = new JTextField();
		fldEmail.setBounds(140, 130, 220, 20);
		InputPanel.add(fldEmail);
		fldEmail.setColumns(10);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setBounds(140, 160, 220, 20);
		InputPanel.add(lblAddress);
		fldName1.setBounds(140, 40, 220, 20);
		InputPanel.add(fldName1);
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContact.setBounds(0, 0, 450, 30);
		InputPanel.add(lblContact);
		btnBack.setBounds(5, 5, 85, 25);
		InputPanel.add(btnBack);
		BusinessPanel.setBounds(0, 340, 450, 150);
		BusinessPanel.setLayout(null);
		fldWPhone = new JTextField();
		fldWPhone.setColumns(10);
		fldWPhone.setBounds(140, 0, 155, 20);
		BusinessPanel.add(fldWPhone);
		lblWPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWPhone.setBounds(45, 3, 80, 15);
		BusinessPanel.add(lblWPhone);
		lblCompany.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompany.setBounds(45, 63, 80, 15);
		BusinessPanel.add(lblCompany);
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setBounds(45, 93, 80, 15);
		BusinessPanel.add(lblDepartment);
		lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosition.setBounds(45, 123, 80, 15);
		BusinessPanel.add(lblPosition);
		fldCompany = new JTextField();
		fldCompany.setColumns(10);
		fldCompany.setBounds(140, 60, 220, 20);
		BusinessPanel.add(fldCompany);
		fldDepartment = new JTextField();
		fldDepartment.setColumns(10);
		fldDepartment.setBounds(140, 90, 220, 20);
		BusinessPanel.add(fldDepartment);
		fldPosition = new JTextField();
		fldPosition.setColumns(10);
		fldPosition.setBounds(140, 120, 220, 20);
		BusinessPanel.add(fldPosition);
		lblWork.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWork.setBounds(140, 30, 220, 20);
		BusinessPanel.add(lblWork);
		PersonalPanel.setLayout(null);
		PersonalPanel.setBounds(0, 340, 450, 150);
		fldHPhone.setColumns(10);
		fldHPhone.setBounds(140, 0, 155, 20);
		PersonalPanel.add(fldHPhone);
		lblHome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHome.setBounds(45, 3, 80, 15);
		PersonalPanel.add(lblHome);
		lblTwitter.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTwitter.setBounds(45, 63, 80, 15);
		PersonalPanel.add(lblTwitter);
		lblInstagram.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInstagram.setBounds(45, 93, 80, 15);
		PersonalPanel.add(lblInstagram);
		lblRelationship.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRelationship.setBounds(45, 123, 80, 15);
		PersonalPanel.add(lblRelationship);
		fldTwitter.setColumns(10);
		fldTwitter.setBounds(140, 60, 115, 20);
		PersonalPanel.add(fldTwitter);
		fldInstagram.setColumns(10);
		fldInstagram.setBounds(140, 90, 115, 20);
		PersonalPanel.add(fldInstagram);
		lblSocial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSocial.setBounds(140, 30, 220, 20);
		btnBack.addActionListener(this);
		btnClear.addActionListener(this);
		PersonalPanel.add(lblSocial);
		cmbxRelationship.setModel(new DefaultComboBoxModel(new String[] { "Relationship", "Spouse/Partner", "Family",
				"Friend", "Acquaitance", "Neighour", "Other" }));
		cmbxRelationship.setBounds(140, 120, 115, 20);
		PersonalPanel.add(cmbxRelationship);
		btnAdd.addActionListener(this);
	}

	public void clear() {
		fldName1.setText("");
		fldName2.setText("");
		fldEmail.setText("");
		fldStreet.setText("");
		fldCity.setText("");
		fldPCode.setText("");
		fldCPhone.setText("");
		fldHPhone.setText("");
		fldWPhone.setText("");
		fldTwitter.setText("");
		fldInstagram.setText("");
		fldCompany.setText("");
		fldDepartment.setText("");
		fldPosition.setText("");
		
		cmbxDay.setSelectedIndex(0);
		cmbxMonth.setSelectedIndex(0);
		cmbxYear.setSelectedIndex(0);
		cmbxProvince.setSelectedIndex(0);
		cmbxRelationship.setSelectedIndex(0);
	}

	public void back() {
		lblContact.setText("Business Contact");
		
		getContentPane().remove(BusinessPanel);
		getContentPane().remove(InputPanel);
		getContentPane().remove(PersonalPanel);
		
		getContentPane().add(BannerPanel);
		
		ButtonPanel.removeAll();
		ButtonPanel.add(btnPersonal);
		ButtonPanel.add(btnBusiness);
		ButtonPanel.setBounds(0, 30, 450, 35);
		
		revalidate();
		setSize(465, 100);
		setLocationRelativeTo(null);
	}

	public void assign() {
		contact.setName1(fldName1.getText());
		contact.setName2(fldName2.getText());
		contact.setDay(cmbxDay.getSelectedIndex());
		contact.setMonth(cmbxMonth.getSelectedIndex());
		if (cmbxYear.getSelectedIndex() != 0)
			contact.setYear(2017-cmbxYear.getSelectedIndex());
		else
			contact.setYear(0);
		contact.setStreet(getField(fldStreet));
		contact.setCity(getField(fldCity));
		if (cmbxProvince.getSelectedIndex() != 0) 
			contact.setProvince((String)cmbxProvince.getSelectedItem());
		else
			contact.setProvince("n/a");
		contact.setPCode(getField(fldPCode).toUpperCase());
		contact.setEmail(getField(fldEmail));
		contact.setCPhone(getField(fldCPhone));
		
		if(contact instanceof PersonalContact) {
			PersonalContact personal = (PersonalContact)contact;
			personal.setHPhone(getField(fldHPhone));
			personal.setTwitter(getField(fldTwitter));
			personal.setInstagram(getField(fldInstagram));
			if (cmbxRelationship.getSelectedIndex() != 6)
				personal.setRelationship(cmbxRelationship.getSelectedIndex());
			else {
				personal.setRelationship(99);
			}
			if(personal.add())
				JOptionPane.showMessageDialog(this, personal.getID()+" contact added", "Contact successfully added", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(contact instanceof BusinessContact) {
			BusinessContact business = (BusinessContact)contact;
			business.setWPhone(getField(fldWPhone));
			business.setCompany(getField(fldCompany));
			business.setDepartment(getField(fldDepartment));
			business.setPosition(getField(fldPosition));
			if(business.add())
				JOptionPane.showMessageDialog(this, business.getID()+" contact added", "Contact Successfully added", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private boolean checkField(JTextField tf) {
		return tf.getText().length() > 0;
	}
	
	private String getField(JTextField tf) {
		if(checkField(tf)) {
			return tf.getText();
		}
		else {
			return "n/a";
		}
	}
	
	private boolean checkPhone(String line) {
		return line.matches("[1-9]{3}-[1-9]{3}-[1-9]{4}");
	}
	private boolean checkDOB() {
		boolean valid = true;
		switch(cmbxMonth.getSelectedIndex()) {
		case 4:
		case 6:
		case 9:
		case 11:
			if(cmbxDay.getSelectedIndex()==31) {valid = false;}
		break;
		case 2:
			int maxDays=28;
			if((2017-cmbxYear.getSelectedIndex())%4==0) {
				if((2017-cmbxYear.getSelectedIndex())%100==0) {
					if((2017-cmbxYear.getSelectedIndex())%400==0) {
						maxDays = 29;
					}
				}
				else {
					maxDays = 29;
				}
			}
			if(cmbxDay.getSelectedIndex()>maxDays) {valid = false;}
		break;
		}
		return valid;
		
	}
	public boolean validateInput() {
		boolean validity = true;
		if(checkField(fldName1)==false) {
			JOptionPane.showMessageDialog(this, "You must enter a first name", "First name missing", JOptionPane.ERROR_MESSAGE);
			validity = false;
		}
		else if(checkField(fldName2)==false) {
			JOptionPane.showMessageDialog(this, "You must enter a last name", "Last name missing", JOptionPane.ERROR_MESSAGE);
			validity = false;
		}
		else if(checkDOB()==false) {
			JOptionPane.showMessageDialog(this, "You must enter a valid day of birth", "Day of brith invalid", JOptionPane.ERROR_MESSAGE);
			validity = false;
		}
		else if(checkField(fldPCode)) {
			if(fldPCode.getText().matches("[a-zA-Z][0-9][a-zA-Z][0-9][a-zA-Z][0-9]")==false) {
				JOptionPane.showMessageDialog(this, "You must enter a valid Postal Code", "Postal code invalid", JOptionPane.ERROR_MESSAGE);
				validity = false;
			}
		}
		else if(checkField(fldEmail)==false) {
			JOptionPane.showMessageDialog(this, "You must enter an Email", "Email missing", JOptionPane.ERROR_MESSAGE);
			validity = false;
		}
		else if(fldEmail.getText().matches(".+@.+[.].{2,7}")==false) {
			JOptionPane.showMessageDialog(this, "You must enter a valid Email", "Email invalid", JOptionPane.ERROR_MESSAGE);
			validity = false;
		}
		else if(checkField(fldCPhone)) {
			if(checkPhone(fldCPhone.getText())==false) {
				JOptionPane.showMessageDialog(this, "You must enter a valid phone number in 111-111-1111 format", "Cell phone number invalid", JOptionPane.ERROR_MESSAGE);
				validity = false;
			}
		}
		else if (contact instanceof PersonalContact) {
			if(checkField(fldHPhone)) {
				if(checkPhone(fldHPhone.getText())==false) {
					JOptionPane.showMessageDialog(this, "You must enter a valid phone number in 111-111-1111 format", "Home phone number invalid", JOptionPane.ERROR_MESSAGE);
					validity = false;
				}
			}
			
			else if(cmbxRelationship.getSelectedIndex()==0) {
				JOptionPane.showMessageDialog(this, "You must set a relationship", "Relationship not set", JOptionPane.ERROR_MESSAGE);
				validity = false;
			}
		}
		else if(contact instanceof BusinessContact) {
			if(checkField(fldWPhone)) {
				if(checkPhone(fldWPhone.getText())==false) {
					JOptionPane.showMessageDialog(this, "You must enter a valid phone number in 111-111-1111 format", "Work phone number invalid", JOptionPane.ERROR_MESSAGE);
					validity = false;
				}
			}
			
			else if(checkField(fldCompany)==false) {
				JOptionPane.showMessageDialog(this, "You must enter a company", "Company missing", JOptionPane.ERROR_MESSAGE);
				validity = false;
			}
		}
		return validity;
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnPersonal) {
			lblContact.setText("Personal Contact");
			contact = new PersonalContact();
			getContentPane().remove(BannerPanel);
			getContentPane().add(InputPanel);
			getContentPane().add(PersonalPanel);
			ButtonPanel.removeAll();
			ButtonPanel.add(btnClear);
			ButtonPanel.add(btnAdd);
			ButtonPanel.setBounds(0, 490, 450, 35);
			revalidate();
			setSize(450, 562);
			setLocationRelativeTo(null);

		}
		if (event.getSource() == btnBusiness) {
			contact = new BusinessContact();
			getContentPane().remove(BannerPanel);
			getContentPane().add(BusinessPanel);
			getContentPane().add(InputPanel);
			ButtonPanel.removeAll();
			ButtonPanel.add(btnClear);
			ButtonPanel.add(btnAdd);
			ButtonPanel.setBounds(0, 490, 450, 35);
			revalidate();
			setSize(465, 562);
			setLocationRelativeTo(null);
		}
		if (event.getSource() == btnBack) {
			clear();
			back();
		}
		if (event.getSource() == btnClear) {
			clear();
		}
		if (event.getSource() == btnAdd) {
			if(validateInput()) {
			assign();
			clear();
			back();
			}
		}
	}

	public static void main(String[] args) {

		ContactListFrame frame = new ContactListFrame();
		frame.setTitle("Contact List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(465, 100);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		Contact.close();
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
