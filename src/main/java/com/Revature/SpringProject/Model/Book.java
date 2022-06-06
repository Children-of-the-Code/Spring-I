package com.Revature.SpringProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
lombok - automating the creation of model classes
2 annotations auto generating constructors
data autogenerates getters/setters
tostring autogenerates a tostring
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Book {
    private int id;
    private String title;
    private String author;
}
