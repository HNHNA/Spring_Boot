package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog ,Long> {
}
