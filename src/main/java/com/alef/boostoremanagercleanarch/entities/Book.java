package com.alef.boostoremanagercleanarch.entities;

import com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.domain.AuthorData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String name;
    private String isbn;
    private int totalPage;
    private int totalChapter;
    private AuthorData author;
    private Publisher publisher;
    private User user;
}
