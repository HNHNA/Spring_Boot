package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
