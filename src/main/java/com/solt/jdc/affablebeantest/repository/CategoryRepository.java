package com.solt.jdc.affablebeantest.repository;

import com.solt.jdc.affablebeantest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
