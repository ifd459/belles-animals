package care.clinic.bellesanimals.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String birthday;
	private String arrivalDate;
	private String gender;
	private boolean desexed;
	private boolean vaccinesUpToDate;
	private String healthNotes;
	private long cageNumber;
	private boolean aggressiveWarning;

	public boolean isAggressiveWarning() {
		return aggressiveWarning;
	}

	public void setAggressiveWarning(boolean aggressiveWarning) {
		this.aggressiveWarning = aggressiveWarning;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isDesexed() {
		return desexed;
	}

	public void setDesexed(boolean desexed) {
		this.desexed = desexed;
	}

	public boolean isVaccinesUpToDate() {
		return vaccinesUpToDate;
	}

	public void setVaccinesUpToDate(boolean vaccinesUpToDate) {
		this.vaccinesUpToDate = vaccinesUpToDate;
	}

	public String getHealthNotes() {
		return healthNotes;
	}

	public void setHealthNotes(String healthNotes) {
		this.healthNotes = healthNotes;
	}

	public long getCageNumber() {
		return cageNumber;
	}

	public void setCageNumber(long cageNumber) {
		this.cageNumber = cageNumber;
	}
}
