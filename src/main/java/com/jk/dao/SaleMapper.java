package com.jk.dao;

import com.jk.model.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mr.wangbin on 2017/11/16.
 */
public interface SaleMapper extends JpaRepository<Sale, Long> {


    @Override
    List<Sale> findAll();


    Page<Sale> findAll(Specification<Sale> specification, Pageable pageable);


}
