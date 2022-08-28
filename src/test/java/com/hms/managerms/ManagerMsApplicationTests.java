/*package com.hms.managerms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hms.managerms.model.Staff;
import com.hms.managerms.repository.StaffRepository;
/*
@SpringBootTest
class ManagerMsApplicationTests {
/*
	@Autowired
	private StaffRepository staffRepository;
	
	
	
	@Test
	public void testCreateStaff() {
		/*Staff s=new Staff();
		s.setStaffId(1L);
		s.setEmployeeName("Meena Mane");
		s.setEmployeeAddress("Baramati");
		s.setNic("55103");
		s.setSalary(15000L);
		s.setAge(26);
		s.setOccupation("Cooker");
		s.setEmail("meenamane@gmail.com");
		
		staffRepository.save(s);
		assertNotNull(staffRepository.findById(16L).get());
		*/
	/*	
	}
	
	
	@Test
	public void testgetStaff() {
		List<Staff> list = staffRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	public void testgetStaffById() {
		Staff s= staffRepository.findById(16L).get();
        assertEquals("Meena Mane", s.getEmployeeName());
		
	}
	
	@Test
	public void testupdateStaffDetails() {
		Staff s= staffRepository.findById(16L).get();
		s.setEmployeeName("Meena Patil");
		staffRepository.save(s);
		assertNotEquals("Meena Mane", staffRepository.findById(16L).get().getEmployeeName());
	}
	
	@Test
	public void testDeleteStaffDetails() {
		staffRepository.deleteById(16L);
		assertThat(staffRepository.existsById(16L)).isFalse();
	}
	}
*/


