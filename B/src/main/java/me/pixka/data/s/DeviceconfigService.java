package me.pixka.data.s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.pixka.data.r.DeviceconfigRepo;
import me.pixka.h.d.Deviceconfig;

@Service
@Transactional
public class DeviceconfigService {

	@Autowired
	private DeviceconfigRepo dao;

	public Deviceconfig find(Long id) {
		return dao.findOne(id);
	}

	public Deviceconfig save(Deviceconfig dc) {
		return dao.save(dc);
	}

	public Deviceconfig last() {
		return dao.findTop1OrderByIdDesc();
	}

}
