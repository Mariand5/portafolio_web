/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mdv.Interface;
//trae una lista de personas

import com.portfolio.mdv.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();
    //guardar objetos tipo persona
    public void savePersona(Persona persona);
    //eliminar personas por id
    public void deletePersona(Long id);
    //encontrar personas
    public Persona findPersona(Long id);
}
