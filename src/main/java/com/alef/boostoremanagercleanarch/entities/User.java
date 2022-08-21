package com.alef.boostoremanagercleanarch.entities;

import com.alef.boostoremanagercleanarch.entities.enums.Gender;
import com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.domain.BookData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String username;
    private String password;
    private LocalDate birthDate;
    private List<BookData> books;
}
