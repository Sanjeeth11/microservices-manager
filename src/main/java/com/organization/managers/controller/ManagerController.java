package com.organization.managers.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organization.managers.entity.Manager;
import com.organization.managers.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@PostMapping("/add/manager")
	public ResponseEntity<Manager> addManager(@RequestBody Manager manager) {

		Manager addedManager = managerService.addManager(manager);

		return new ResponseEntity<Manager>(addedManager, HttpStatus.CREATED);
	}

	@GetMapping("/get/manager/{mId}")
	public ResponseEntity<Optional<Manager>> getManager(@PathVariable String mId) {

		Optional<Manager> addedManager = managerService.getManagerById(mId);
		return new ResponseEntity<Optional<Manager>>(addedManager, HttpStatus.CREATED);

	}
}
