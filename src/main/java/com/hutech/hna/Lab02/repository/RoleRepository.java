package com.hutech.hna.Lab02.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.repository.CrudRepository;
import com.hutech.hna.Lab02.model.Role;


public interface RoleRepository extends JpaAttributeConverter<Role, Long> {

}
