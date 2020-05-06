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
public class PersonalContact extends Contact {
	private String hPhone;
	private String twitter;
	private String instagram;
	private int relationship;
	public PersonalContact() {
		super();
		IDCode = 'P';
		ID = IDCode+String.valueOf(getNextID());
		updateNextID();
	}
	
	public String getHPhone() {
		return hPhone;
	}

	public void setHPhone(String hPhone) {
		this.hPhone = hPhone;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public int getRelationship() {
		return relationship;
	}

	public void setRelationship(int relationship) {
		this.relationship = relationship;
	}

	public char getIDCode() {
		return IDCode;
	}
	public boolean add() {
		String record = ID+"~"+name1+"~"+name2+"~"+day+"~"+month+"~"+year+"~"+street+"~"+city+"~"+province+"~"+pCode+"~"+cPhone+"~"+hPhone+"~"+twitter+"~"+instagram+"~"+relationship;
		File file = new File("PersonalContact.txt");
		System.out.println(record);
		try {
		FileWriter writer = new FileWriter(file,true);
		writer.write(record+"\n");
		writer.close();
		return true;
		}
		catch(IOException e) {return false;}
	}
}
