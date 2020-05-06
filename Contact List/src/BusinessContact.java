import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Roy
 *
 */
public class BusinessContact extends Contact {
	private String wPhone;
	private String company;
	private String department;
	private String position;
	
	public BusinessContact() {
		super();
		IDCode = 'B';
		ID = IDCode+String.valueOf(getNextID());
		updateNextID();
	}
	
	public String getWPhone() {
		return wPhone;
	}

	public void setWPhone(String wPhone) {
		this.wPhone = wPhone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean add() {
		String record = ID+"~"+name1+"~"+name2+"~"+day+"~"+month+"~"+year+"~"+city+"~"+street+"~"+province+"~"+pCode+"~"+cPhone+"~"+wPhone+"~"+company+"~"+department+"~"+position;
		System.out.print(record+"\n");
		File file = new File("BusinessContact.txt");
		try {
		FileWriter writer = new FileWriter(file,true);
		writer.write(record+"\n");
		writer.close();
		return true;
		}
		catch(IOException e) {return false;}
	}
	
}
