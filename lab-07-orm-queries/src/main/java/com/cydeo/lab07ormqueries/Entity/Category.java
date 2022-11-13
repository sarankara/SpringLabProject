package com.cydeo.lab07ormqueries.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity {

    private String name;
}
