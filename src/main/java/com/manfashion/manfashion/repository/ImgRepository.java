package com.manfashion.manfashion.repository;

import com.manfashion.manfashion.model.entity.ImgUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgRepository extends JpaRepository<ImgUrl, Long> {
}
