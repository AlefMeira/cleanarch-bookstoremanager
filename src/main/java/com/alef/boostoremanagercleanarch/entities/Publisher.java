package com.alef.boostoremanagercleanarch.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Publisher {
    private Long id;
    private String name;
    private String code;
    private LocalDate foundationAt;
    private List<Book> books;
}
