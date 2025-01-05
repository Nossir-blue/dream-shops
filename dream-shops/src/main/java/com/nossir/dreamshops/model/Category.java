package com.nossir.dreamshops.model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructo
@NoArgsConstructor
@Entity
public class Category{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  
  @OneToMany(mappedBy = "category")
  private List<Product> products;
}