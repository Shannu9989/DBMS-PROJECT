package com.dxc.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.hms.entity.GuestInfo;

public interface IGuestinfoRepository extends JpaRepository<GuestInfo, Integer> {
}
