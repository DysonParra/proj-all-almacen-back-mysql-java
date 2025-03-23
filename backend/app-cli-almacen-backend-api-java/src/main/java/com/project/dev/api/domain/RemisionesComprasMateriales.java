/*
 * @fileoverview    {RemisionesComprasMateriales}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code RemisionesComprasMateriales}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"RemisionesComprasMateriales\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class RemisionesComprasMateriales implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdRemisionCompraMaterial;
    private String strNumeroRemisionCompra;
    private String strCodigoMaterial;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaNecesaria;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaSolicitud;
    private Double dblCantidad;
    private BigDecimal decValorUnitario;
    private Float fltPorcentajeDescuento;
    private BigDecimal decCostoPromedio;
    private String strUsuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    @JoinColumn(name = "intIdMaterial", referencedColumnName = "intIdMaterial")
    private Long intIdMaterial;
    @JoinColumn(name = "intIdRemisionCompra", referencedColumnName = "intIdRemisionCompra")
    private Long intIdRemisionCompra;

}
