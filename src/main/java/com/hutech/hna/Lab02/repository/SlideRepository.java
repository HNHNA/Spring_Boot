package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.Slide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SlideRepository extends JpaRepository<Slide, Long> {
}
