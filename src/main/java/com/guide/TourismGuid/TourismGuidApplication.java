package com.guide.TourismGuid;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.guide.TourismGuid.entity.Plage_detail;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EntityScan("com.guide.TourismGuid.entity")
@EnableJpaRepositories("com.guide.TourismGuid.entity.repository.AdminRepo") 
public class TourismGuidApplication  {

	public static void main(String[] args) {
		
	
	
		//Plage plage = new Plage("Quemado", "https://www.google.com/search?q=quemado&rlz=1C1SQJL_frMA904MA904&sxsrf=ALeKk02hqC4jdEoYj5p4LTufRS1J6qO64A:1597358191037&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjc6rj8npnrAhXmURUIHcYnDRAQ_AUoAXoECA4QAw#imgrc=Kk8SXSmS4FDw0M", "Plage Quemado");
		
		//

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				
				.addAnnotatedClass(Plage_detail.class);
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		try {
			System.out.println("New ...");
			//Admin admin = new Admin("yousra", "16734");
			//Plage plage = new Plage("Quemado");
			Plage_detail pd = new Plage_detail();
			pd.setImageUrl("image3");
			pd.setLocalisation("Al hoceima Caeabonita");
			
			//plage.setPlageDetail(pd);
			//admin.getPlages();
			//Begin transaction
			Transaction t = session.beginTransaction();
			//save admin
			System.out.println("Saving detail...");
			session.save(pd);
			//Commit transaction
			t.commit();
			session.close();
			System.out.println("saved!!");
		} catch (Exception e) {
			System.out.println(e);
		}

	
	}


	
	

}
