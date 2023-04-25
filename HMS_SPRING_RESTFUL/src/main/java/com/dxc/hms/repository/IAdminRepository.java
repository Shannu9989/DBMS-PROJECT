package com.dxc.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.hms.entity.AdminInfo;

public interface IAdminRepository extends JpaRepository<AdminInfo,Integer> {

}
