/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author kk
 * @param <T>
 */
public interface GenericDAO<T> {

    Serializable create(T t);

    void remove(Class<T> clazz,Serializable id);
    
    List<T> findAll(Class<T> clazz);
    
    T update(T t,Serializable id,Class clazz);
    
    T find(Class<T> clazz,Serializable id);
}
