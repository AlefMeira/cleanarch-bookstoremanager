package com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.repository;

import com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {
}
