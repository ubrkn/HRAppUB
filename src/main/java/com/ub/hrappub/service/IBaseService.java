/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.service;

import java.util.List;

/**
 *
 * @author uberkun
 */
public interface IBaseService<T> {
    
    boolean save (T entity) throws Exception;
    
    boolean update (T entity) throws Exception;
    
    boolean delete (T entity) throws Exception;
    
    List<T> getAll (String query);
    
    T getById (Long id);
    
    
}
