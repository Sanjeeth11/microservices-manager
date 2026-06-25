package com.organization.managers.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.organization.managers.entity.Manager;


public interface ManagerService {

	Manager addManager(Manager manager);

	Optional<Manager> getManagerById(String mId);

}
