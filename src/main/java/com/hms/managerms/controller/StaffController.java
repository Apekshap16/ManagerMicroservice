package com.hms.managerms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.managerms.model.Staff;
import com.hms.managerms.repository.StaffRepository;

@RestController
public class StaffController {

	@Autowired
	private StaffRepository staffRepository;
	
	@PostMapping("/staff")
	public Staff addStaff( @RequestBody Staff staff) {
		
		
		return staffRepository.save(staff);
	}
	
	@GetMapping("/staff")
	public List<Staff> getAllStaff(){
		
		return staffRepository.findAll();
	}
	
	@DeleteMapping("/staff/{sid}")		
	public void deleteStaff(@PathVariable("sid") Long sid) {
		 staffRepository.deleteById(sid);
		}
	
	@PutMapping("/staff/update/{sid}")
	public Staff updateStaff(@PathVariable("sid") Long sid, @RequestBody Staff staffNew) {
		
		Staff staffDB= staffRepository.getById(sid);
		
		if(staffNew.getEmployeeName() !=null) 
			staffDB.setEmployeeName(staffNew.getEmployeeName());
			
		if(staffNew.getEmployeeAddress() !=null) 
				staffDB.setEmployeeAddress(staffNew.getEmployeeAddress());
		if(staffNew.getNic() !=null) 
					staffDB.setNic(staffNew.getNic());
					
		if(staffNew.getSalary() !=null) 
		  staffDB.setSalary(staffNew.getSalary());
						
		if(staffNew.getAge() !=0) 
			staffDB.setAge(staffNew.getAge());
			
		if(staffNew.getEmail() !=null) 
			staffDB.setEmail(staffNew.getEmail());
		
		return staffRepository.save(staffDB);
}
}
	
	