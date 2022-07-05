/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.EquipoController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eps
 */
public class EquipoModelImpl implements EquipoModel {

    private Equipo contacto;
    private EquipoImpl nombreEquipo;
    private EquipoController controller;

    public EquipoModelImpl() {
        super();
    }

    @Override
    public EquipoController getController() {
        return controller;
    }

    @Override
    public void setController(EquipoController controller) {
        this.controller = controller;
    }

    @Override
    public void nuevoEquipo(Equipo contacto) {
        this.contacto = contacto;
    }

    @Override
    public Equipo obtenerEquipo(String nombre) {
        return nombreEquipo;
    }

    @Override
    public void eliminarEquipo(Equipo contacto) {
        this.contacto = contacto;
    }

    @Override
    public void actualizarEquipo(Equipo contacto) {
        this.contacto = contacto;
    }

    @Override
    public List<Equipo> obtenerEquipos() {
        List<Equipo> eq = new ArrayList<Equipo>();
        return eq = this.obtenerEquipos();
    }

}
