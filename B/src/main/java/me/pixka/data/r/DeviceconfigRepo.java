package me.pixka.data.r;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.pixka.h.d.Deviceconfig;

@Repository
public interface DeviceconfigRepo extends CrudRepository<Deviceconfig, Long> {

	Deviceconfig findTop1OrderByIdDesc();

}
