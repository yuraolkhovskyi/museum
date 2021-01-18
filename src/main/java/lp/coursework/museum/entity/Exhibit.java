package lp.coursework.museum.entity;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table
public class Exhibit {

    private Long id;
    private ExhibitType type;
    private String material;
    private String technique;


}
