/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.ps.dao;

import ec.edu.espe.ps.model.DetalleVenta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Protesis Store Corp.
 */
@Stateless
public class DetalleVentaFacade extends AbstractFacade<DetalleVenta> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_prosth-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleVentaFacade() {
        super(DetalleVenta.class);
    }
    
    public List<DetalleVenta> findByCodigo(Integer codigo) {
        Query qry = this.em.createQuery("SELECT obj FROM DetalleVenta obj WHERE obj.codigo=?1");
        qry.setParameter(1, codigo);
        return qry.getResultList();
    }
    
}
