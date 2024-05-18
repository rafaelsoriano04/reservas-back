/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorreservasaulas.servicios.impl;

import gestorreservasaulas.entidades.Horario;
import gestorreservasaulas.respositorios.RepositorioHorario;
import gestorreservasaulas.servicios.ServicioHorario;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author fredd
 */
public class ServicioHorarioImpl implements ServicioHorario{
    @Autowired
    RepositorioHorario repositorioHorario;
     @Override
    public Horario obtenerHorario(Long id) {
        return repositorioHorario.findById(id).orElse(null);
    }
}