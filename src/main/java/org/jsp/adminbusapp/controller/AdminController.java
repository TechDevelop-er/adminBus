package org.jsp.adminbusapp.controller;

import org.jsp.adminbusapp.dto.Admin;
import org.jsp.adminbusapp.dto.ResponseStructure;
import org.jsp.adminbusapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admins")
	public ResponseEntity<ResponseStructure<Admin>> registerAdmin(@RequestBody Admin admin) {
		return adminService.registerAdmin(admin);
	}
}
