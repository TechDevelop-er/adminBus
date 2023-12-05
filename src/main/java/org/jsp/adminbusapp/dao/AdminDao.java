package org.jsp.adminbusapp.dao;

import org.jsp.adminbusapp.dto.Admin;
import org.jsp.adminbusapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin registerAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
}
