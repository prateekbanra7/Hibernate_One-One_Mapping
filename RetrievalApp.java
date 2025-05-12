package in.abc.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.abc.model.Account;
import in.abc.model.Employee;
import in.abc.util.HibernateUtil;

public class RetrievalApp {

	public static void main(String[] args) {

		Session session = null;
		

		try {
			session = HibernateUtil.getSession();
			Employee employee = session.get(Employee.class, 1);
			System.out.println(employee);
				
			
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
