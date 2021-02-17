package eh.project.l08.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import eh.project.l01.entity.L04_Student;
import eh.project.l08.example.Factory;
import eh.project.l08.example.FactoryImpl;
import eh.project.l08.example.Repository;

public class RepositoryImpl implements Repository {
	
	private Factory factory = new FactoryImpl();
	private EntityManager entityManager = factory.getEntityManager();
	private EntityTransaction transaction = factory.getEntityTransaction();
	
	@Override
	public void save(L04_Student student) {
		
		this.transaction.begin();
		this.entityManager.persist(student);
		this.transaction.commit();
		
	}

	@Override
	public void delete(L04_Student student) {

		this.transaction.begin();
		this.entityManager.remove(student);
		this.transaction.commit();		
		
	}

	@Override
	public L04_Student find(int id) {
		
		L04_Student student = this.entityManager.find(L04_Student.class, id);
		if (student != null) {
			return student;
		}else {
			System.out.println("Student data not found !");
			return null;
		}
	}

	@Override
	public L04_Student update(L04_Student student) {

		L04_Student updateStudent = this.entityManager.merge(student);
		
		return updateStudent;
	}

}
