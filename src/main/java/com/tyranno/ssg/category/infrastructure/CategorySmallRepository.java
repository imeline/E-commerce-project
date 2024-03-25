package com.tyranno.ssg.category.infrastructure;

import com.tyranno.ssg.category.domain.Category;
import com.tyranno.ssg.category.domain.CategorySmall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategorySmallRepository extends JpaRepository<CategorySmall,Long> {
    Optional<CategorySmall> findById(Long id);
}
