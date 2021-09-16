package com.cb.viooh.item.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "item")
@Entity
@Data
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer itemId;

    @Column(name = "item_code")
    String itemCode;

    @Column(name = "item_name")
    String itemName;

    @Column(name = "price")
    Double price;

    @Column(name = "item_type")
    String itemType;
}
