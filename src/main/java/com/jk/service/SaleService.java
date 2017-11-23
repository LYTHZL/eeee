package com.jk.service;

import com.jk.model.Sale;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Mr.wangbin on 2017/11/16.
 */
public interface SaleService {

    List<Sale> getUserList();


    Page<Sale> findBookNoCriteria(Integer page, Integer size, Sale sale);

    void save(Sale sale);
}
