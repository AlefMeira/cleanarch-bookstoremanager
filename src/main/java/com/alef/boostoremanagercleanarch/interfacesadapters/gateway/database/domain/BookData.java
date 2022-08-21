package com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "book")
public class BookData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", length = 50)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ISBN", length = 20, nullable = false)
    private String isbn;

    @Column(name = "TOTAL_PAGE", columnDefinition = "Integer default 0")
    private int totalPage;

    @Column(name = "TOTAL_CHAPTER", columnDefinition = "Integer default 0")
    private int totalChapter;

    @ManyToOne(cascade = CascadeType.MERGE)
    private AuthorData author;

    @ManyToOne(cascade = CascadeType.MERGE)
    private PublisherData publisher;

    @ManyToOne(cascade = CascadeType.MERGE)
    private UserData user;
}
