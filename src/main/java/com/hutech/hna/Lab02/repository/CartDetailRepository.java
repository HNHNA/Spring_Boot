package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
}
