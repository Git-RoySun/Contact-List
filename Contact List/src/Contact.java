import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Roy
 *
 */
public abstract class Contact {
	protected String name1;
	protected String name2;
	protected String email;
	protected String street;
	protected String city;
	protected String province;
	protected String pCode;
	protected String cPhone;
	protected int day;
	protected int month;
	protected int year;
	protected static int  nextID;
	protected char IDCode;
	protected String ID;
	
	public Contact() {
		name1 ="n/a";
		name2 ="n/a";
		email ="n/a";
		street = "n/a";
		city = "n/a";
		province = "n/a";
		pCode = "n/a";
		cPhone = "n/a";
		day =0;
		month=0;
		year=0;
	}
	
	
	public String getName1() {
		return name1;
	}


	public void setName1(String name1) {
		this.name1 = name1;
	}


	public String getName2() {
		return name2;
	}


	public void setName2(String name2) {
		this.name2 = name2;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getPCode() {
		return pCode;
	}


	public void setPCode(String pCode) {
		this.pCode = pCode;
	}


	public String getCPhone() {
		return cPhone;
	}


	public void setCPhone(String cPhone) {
		this.cPhone = cPhone;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public static void updateNextID() {
		nextID+=1;
	}
	public static int getNextID() {
		return nextID;
	}
	
	public char getIDCode() {
		return IDCode;
	}

	public static void initialize() {
		File savedID = new File("ContactIdentifier.txt");
		try {
			Scanner reader = new Scanner(savedID);
			nextID = reader.nextInt();
			reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
	
	public static void close() {
		File savedID = new File("ContactIdentifier.txt");
		try {
			FileWriter writer = new FileWriter(savedID);
			writer.write(String.valueOf(nextID));
			writer.close();
		}
		catch(IOException e) {}
	}
	public String getID() {
		return ID;
	}
	
	
	public abstract boolean add();
}
