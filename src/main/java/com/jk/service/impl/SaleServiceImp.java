package com.jk.service.impl;

import com.jk.dao.SaleMapper;
import com.jk.model.Sale;
import com.jk.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.wangbin on 2017/11/16.
 */

@Service
public class SaleServiceImp implements SaleService {

    @Autowired
    private SaleMapper saleMapper;



    @Override
    public List<Sale> getUserList() {

        return saleMapper.findAll();
    }

    @Override
    public Page<Sale> findBookNoCriteria(Integer page, Integer size,final Sale sale) {
        Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "id");
        Page<Sale> salePage = saleMapper.findAll(new Specification<Sale>(){

            public Predicate toPredicate(Root<Sale> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(null!=sale.getId()&&!"".equals(sale.getId())){
                    list.add(criteriaBuilder.equal(root.get("id").as(Long.class), sale.getId()));
                }
                if(null!=sale.getInfo()&&!"".equals(sale.getInfo())){
                    list.add(criteriaBuilder.equal(root.get("info").as(String.class), sale.getInfo()));
                }
                if(null!=sale.getCustom()&&!"".equals(sale.getCustom())){
                    list.add(criteriaBuilder.equal(root.get("custom").as(String.class), sale.getCustom()));
                }
                if(null!=sale.getSaledate()&&!"".equals(sale.getSaledate())){
                    list.add(criteriaBuilder.equal(root.get("saledate").as(String.class), sale.getSaledate()));
                }
                if(null!=sale.getMoney()&&!"".equals(sale.getMoney())){
                    list.add(criteriaBuilder.equal(root.get("money").as(String.class), sale.getMoney()));
                }
                if(null!=sale.getShenhe()&&!"".equals(sale.getShenhe())){
                    list.add(criteriaBuilder.equal(root.get("shenhe").as(String.class), sale.getShenhe()));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        },pageable);
        return salePage;

    }

    @Override
    public void save(Sale sale) {
        saleMapper.save(sale);
    }


}
