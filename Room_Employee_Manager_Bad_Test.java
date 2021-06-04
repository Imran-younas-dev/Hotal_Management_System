package hotel.management.system;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class Room_Employee_Manager_Bad_Test {

	@Test
	void test() {
		int out = 18;
		AddRoom obj1 = new AddRoom();
		int out1 = obj1.dbRoomTest(out);
		assertEquals(18, out1);
		AddEmployee obj2 = new AddEmployee();
		int out2 = obj2.dbEmployeeCheck(10);
		assertEquals(10, out2);
		try {
			ManagerInfo obj3 = new ManagerInfo();
			int out3 = obj3.dbManagerCheck(out1);
			assertEquals(10, out2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
