package Muthu.BookPU;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.model.Manager;
import com.model.OwnerKey;
import com.model.Pet;
import com.model.PetStore;
import com.model.User;
import com.model2.Item;
import com.model2.Order;
import com.model2.SalePerson;
import com.model2.Sales;
import com.model2.TurnOver;
import com.service.ItemService;
import com.service.PetService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

// this is user 1


//        //System.out.println("Hello World!");
//    	
//    	PetService s=new PetService();
//    	Pet p = new Pet();
//    	p.setAge(1);
//    	p.setPetId(10);
//    	p.setPetName("Leo");
//    	p.setPetType("Gold");
//    	//s.savePet(p);
//    	//System.out.println(s.getPet(1));
//    	ArrayList<Pet> l=new ArrayList<>();
//    	l.add(p);
//    	PetStore q=new PetStore();
//    	q.setPetStoreId(2);
//    	q.setPetStoreAddress("Hello");
//    	q.setPetList(l);
//    	p.setPetStore(q);
//    	p.setPetStore(q);
//    	p.setAge(10);
//    	//s.updatePet(1, p);
//    	//s.savePetStore(q);
//    	//System.out.println(p.getAge());
////    	OwnerKey o = new OwnerKey();
////    	   o.setAddress("Near me");
////           o.setEmailId("abc@gmail.com");
////           o.setEmployeeId(1L);
////           ArrayList<PetStore> ol = new ArrayList<>();
////           ol.add(q);
////           o.setPetStoreList(ol);
////           s.saveOwner(o);
//    	Manager g=new Manager();
//    	g.setManagerName("Ram");
//    	g.setManagerId(1);
//    	g.setAddress("TVl");
//    	g.setPetStore(q);
//    	s.saveManager(g);
    	
//    	EntityManagerFactory f=Persistence.createEntityManagerFactory("PetPU");
//    	EntityManager e=f.createEntityManager();
//    	
//    	User o=new User();
//    	o.setId(5);
//    	o.setName("Ram");
//		EntityTransaction t=e.getTransaction();
//		t.begin();
//		e.persist(o);
//		t.commit();
////		EntityTransaction t1=e.getTransaction();
////		t1.begin();
////		e.remove(o);
////		t1.commit();
//		o.setName("Ramu");
//		EntityTransaction t1=e.getTransaction();
//		t1.begin();
//		e.merge(o);
//		t1.commit();
		
    	Item q=new Item();
    	q.setItemId(2);
    	q.setItemName("Apple");
    	q.setPrice(100);
    	q.setAvailableInStock(true);
    	
    	List<Item> l1=new ArrayList<>();
    	l1.add(q);
    	Order o=new Order();
    	o.setOrderId(2);
    	o.setItemList(l1);
    	o.setDateofDelivery(Date.valueOf(LocalDate.now()));
    	o.setTotal(100);
    	o.setStatus(true);
    	
    	List<Order> l2=new ArrayList<>();
    	l2.add(o);
    	SalePerson s=new SalePerson();
    	s.setPersonId(2);
    	s.setPersonName("Ram");
    	s.setOrderList(l2);
    	
    	List<SalePerson> l3=new ArrayList<>();
    	l3.add(s);
    	Sales s2=new Sales();
    	s2.setSaleId(2);
    	s2.setSalePersonList(l3);
    	s2.setTotalSales(100);
    	
    	List<Sales> l4=new ArrayList<>();
    	l4.add(s2);
    	TurnOver m=new TurnOver();
    	m.setYear(2025);
    	m.setL(l4);
    	
    	s2.setT(m);
    	s.setSales(s2);
    	o.setPerson(s);
    	q.setOrder(o);
    	ItemService n=new ItemService();
    	n.saveItem(m);
    	
    }
}
