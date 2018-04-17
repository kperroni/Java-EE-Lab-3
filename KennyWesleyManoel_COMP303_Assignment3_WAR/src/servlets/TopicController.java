package servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Topic;

/**
 * Servlet implementation class Faq
 */
@WebServlet("/Topic")
public class TopicController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopicController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		em = emf.createEntityManager();
		Query q = em.createNamedQuery("Topic.findAll");
		
		List<Topic> topics =  q.getResultList();
		for (Topic topic : topics) {
			System.out.println(topic.getTopicName());
		}
		
	}

}
