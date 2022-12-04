package com.erasmuarrem.ErasMove.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class Student extends User {

    private int semester;
    private String departmentName;


}
