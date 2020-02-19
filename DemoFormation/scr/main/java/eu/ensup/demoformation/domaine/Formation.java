package eu.ensup.demoformation.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String theme;
	private String adresse;

	public Formation() {
		super();
	}

	public Formation(String theme, String adresse) {
		super();
		this.theme = theme;
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public Long getId() {
		return id;
	}

	public String getTheme() {
		return theme;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
