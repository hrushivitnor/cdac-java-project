package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Producers;

public interface IProducerDao extends JpaRepository<Producers, Integer> {

}
