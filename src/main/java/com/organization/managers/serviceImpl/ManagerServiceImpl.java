package com.organization.managers.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.managers.entity.Manager;
import com.organization.managers.repo.ManagerRepo;
import com.organization.managers.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepo managerRepo;

	@Override
	public Manager addManager(Manager manager) {
		Manager addedManager = managerRepo.save(manager);
		return addedManager;
	}

	@Override
	public Optional<Manager> getManagerById(String mId) {
		Optional<Manager> manager = managerRepo.findById(mId);

		return manager;
	}

}
