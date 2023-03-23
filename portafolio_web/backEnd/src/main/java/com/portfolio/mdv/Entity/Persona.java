/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mdv.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    //los arrobas son condiciones para el campo de abajo
    @Id
    /*el campo generated será autogenerado, hibernate va a generarle un numero 
    a cada registro sin necesidad de que nosotros lo hagamos*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String img;
}
