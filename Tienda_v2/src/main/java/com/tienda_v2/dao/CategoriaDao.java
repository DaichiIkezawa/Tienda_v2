package com.tienda_v2.dao;

import com.tienda_v2.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC MASTER
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}
