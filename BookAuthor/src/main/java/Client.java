

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookAuthor");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Book1 book = new Book1();
		book.setName("Wings Of Fire");
		book.setId(1);
		book.setPrice(525);
		Author author = new Author();
		author.setBook1(book);
		String dInStr2 = "1967-11-20"; 
		author.setDateOfBirth(LocalDate.parse(dInStr2));
		author.setId(1);
		author.setName("APJ Kalam");
		
		
		
		//persist only student, no need to persist Address explicitly
		em.persist(book);
		em.getTransaction().commit();
		
		System.out.println("Added book.");
		em.close();
		factory.close();

	}

}
