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

import com.guide.TourismGuid.entity.Admin;
import com.guide.TourismGuid.entity.Plage;
import com.guide.TourismGuid.entity.Plage_detail;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EntityScan("com.guide.TourismGuid.entity")
@EnableJpaRepositories("com.guide.TourismGuid.entity.repository.AdminRepo") 
public class TourismGuidApplication  {

	public static void main(String[] args) {
		
	
	
		//Plage plage = new Plage("Quemado", "https://www.google.com/search?q=quemado&rlz=1C1SQJL_frMA904MA904&sxsrf=ALeKk02hqC4jdEoYj5p4LTufRS1J6qO64A:1597358191037&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjc6rj8npnrAhXmURUIHcYnDRAQ_AUoAXoECA4QAw#imgrc=Kk8SXSmS4FDw0M", "Plage Quemado");
		
		//admin.getPlages().add(plage);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Plage.class)
				
				.addAnnotatedClass(Plage_detail.class);
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		try {
			System.out.println("New ...");
			Plage plage = new Plage("Carabonita");
			Plage_detail pd = new Plage_detail("image", "Al hoceima Calabonita");
			
			plage.setPlageDetail(pd);
			//Begin transaction
			session.beginTransaction();
			//save admin
			System.out.println("Saving detail...");
			session.save(plage);
			//Commit transaction
			session.getTransaction().commit();
		} finally {
			sf.close();
		}
		

	
	}


	
	

}
