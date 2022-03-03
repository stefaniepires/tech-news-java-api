package com.technews.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Table;


// Entity: marks this object as a persistable object so that the user can map to a table */
// Json Ignore Props: specifies properties that should be ignored when serializing the object to JSON
// Table: the name of the table that this class maps to 

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")


public class User {

}