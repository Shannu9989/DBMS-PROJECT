package com.dxc.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.hms.entity.FoodInfo;

public interface IFoodRepository extends JpaRepository<FoodInfo, Integer> {

}
