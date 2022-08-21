package com.alef.boostoremanagercleanarch.interfacesadapters.gateway.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@Entity(name = "publisher")
@NoArgsConstructor
public class PublisherData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", length = 50)
    private Long id;

    @Column(name = "NAME", length = 100, unique = true)
    private String name;

    @Column(name = "CODE", length = 100, unique = true)
    private String code;

    @Column(name = "FOUNDATION_AT", columnDefinition = "TIMESTAMP")
    private LocalDate foundationAt;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<BookData> books;
}
