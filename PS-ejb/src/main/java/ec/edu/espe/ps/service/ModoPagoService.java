/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.ps.service;

import ec.edu.espe.ps.dao.ModoPagoFacade;
import ec.edu.espe.ps.model.ModoPago;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Protesis Store Corp.
 */
@Stateless
@LocalBean
public class ModoPagoService {
    
    @EJB
    private ModoPagoFacade modoPagoFacade;

    public List<ModoPago> obtenerTodos() {
        return this.modoPagoFacade.findAll();
    }

    public ModoPago obtenerPorCodigo(String codigo) {
        return this.modoPagoFacade.find(codigo);
    }

    public void crear(ModoPago modoPago) {
        this.modoPagoFacade.create(modoPago);
    }

    public void modificar(ModoPago modoPago) {
        this.modoPagoFacade.edit(modoPago);
    }

    public void eliminar(String codigo) {
        ModoPago modoPago = this.modoPagoFacade.find(codigo);
        this.modoPagoFacade.remove(modoPago);
    }
}
