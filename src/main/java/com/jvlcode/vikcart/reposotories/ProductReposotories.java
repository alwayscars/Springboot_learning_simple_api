package com.jvlcode.vikcart.reposotories;

import com.jvlcode.vikcart.models.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface ProductReposotories extends JpaRepository<product,Long>{}

