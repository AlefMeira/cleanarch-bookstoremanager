package com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.repository;

import com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.domain.BookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookData, Long> {
}
