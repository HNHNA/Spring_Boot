package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
