package org.fintx.sequence.entity;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Sequence {
    private String name;

    private Integer currentValue;

    private Integer increment;
 
}