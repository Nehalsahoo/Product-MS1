package com.cg.iter.productms.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.iter.productms.dto.ProductDTO;

public interface ProductRepository extends CrudRepository<ProductDTO, String>
                           {

}
