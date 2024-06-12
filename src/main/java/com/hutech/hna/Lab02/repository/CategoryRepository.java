package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
