package module.certificateservice;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String issuer;
    private LocalDate issue_date;
    private LocalDate expiry_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public LocalDate getIssueDate() {
		return issue_date;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issue_date = issueDate;
	}
	public LocalDate getExpiryDate() {
		return expiry_date;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiry_date = expiryDate;
	}
    
    
}
