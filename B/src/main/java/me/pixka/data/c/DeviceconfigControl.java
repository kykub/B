package me.pixka.data.c;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import me.pixka.data.s.DeviceconfigService;
import me.pixka.h.d.Deviceconfig;

@Controller
public class DeviceconfigControl {
	@Autowired
	private DeviceconfigService service;

	public Deviceconfig get(Long id) {
		return service.find(id);
	}

	public Deviceconfig save(Deviceconfig dc) {
		return service.save(dc);
	}

	public Deviceconfig last() {

		return service.last();
	}

	public List list() {
		return service.list();
	}

	public Deviceconfig findOne(Long id) {
		return service.findOne(id);
	}
}
