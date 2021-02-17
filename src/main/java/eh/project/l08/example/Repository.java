package eh.project.l08.example;

import eh.project.l01.entity.L04_Student;

public interface Repository {
	
	void save(L04_Student student);
	
	void delete(L04_Student student);
	
	L04_Student find(int id);
	
	L04_Student update(L04_Student student);

}
