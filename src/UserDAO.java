 //FILL YOUR CODE

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO {
	
	private SessionFactory sessionFactory = null;
	public UserDAO() {

		sessionFactory = HibernateUtil.getSessionFactory();

	}
	
	public void insert(User user) {
		//FILL YOUR CODE
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.save(user);
		session.flush();
		t.commit();
		session.close();
		
	}
	
	public List<User> list(){
		//FILL YOUR CODE
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from User u order by u.name,u.phoneNumber");
		List<User> userlist = q.list();
		session.close();
		sessionFactory.close();
		return userlist;
	}
}

