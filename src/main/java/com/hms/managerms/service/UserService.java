package com.hms.managerms.service;



import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hms.managerms.model.Manager;
import com.hms.managerms.repository.ManagerRepository;




@Service
public class UserService implements UserDetailsService {

	@Autowired
	ManagerRepository managerRepository;
	// custome userservice userdetailsservice from spring security
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// logic to get the user from the database
		
		Optional<Manager> manager= managerRepository.findById(username);
		
		if(manager.isPresent()) {
			
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		Arrays.asList(manager.get().getRole().split(",")).stream().forEach(authority ->{
			authorities.add(new SimpleGrantedAuthority(authority));
		});
		return new User(manager.get().getUsername(), manager.get().getPassword(), authorities);
		}else {
			throw new UsernameNotFoundException("User Not Found");
		}
		
	
		//return new User("admin", "password", new ArrayList<>());
	}

	
}
