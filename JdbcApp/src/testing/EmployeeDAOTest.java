package testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.Employee;
import dao.EmployeeDAO;

class EmployeeDAOTest {

	static EmployeeDAO dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		dao = new EmployeeDAO();
	}

	@Test
	@Disabled
	void testInsertEmployee() {

		Employee emp = new Employee(109, "Sai", 80000);

		int actual = dao.insertEmployee(emp);

		assertEquals(1, actual);

	}

	@Test
	void testGetEmployeeById() {
		
			Employee e1 =	dao.getEmployeeById(102);
			
			assertNotNull(e1);
			
			assertEquals(10000, e1.getSalary());
			

	}

}
