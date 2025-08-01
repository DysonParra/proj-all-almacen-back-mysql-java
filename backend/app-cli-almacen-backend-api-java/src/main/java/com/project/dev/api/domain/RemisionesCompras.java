/*
 * @overview        {RemisionesCompras}
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
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code RemisionesCompras}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"remisiones_compras\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class RemisionesCompras implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdRemisionCompra;
    private String strNumeroRemisionCompra;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaContabilizacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaValidez;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaDocumento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaNecesaria;
    private String strNumeroReferencia;
    private BigDecimal decTotalBruto;
    private Double dblPorcentajeDescuento;
    private Double dblPorcentajeImpuesto;
    private BigDecimal decValorTotal;
    private String strComentarios;
    private String strUsuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    private Long intIdTipoDocumento;
    private Long intIdRemision;
    private Long intIdInterlocutor;

}
