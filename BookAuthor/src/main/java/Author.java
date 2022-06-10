

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Author1")
public class Author implements Serializable {
//(id,name,dateofbirth)
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;
	LocalDate dateOfBirth;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "Book_ID")
	private Book1 book1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book1 getBook1() {
		return book1;
	}

	public void setBook1(Book1 book1) {
		this.book1 = book1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
