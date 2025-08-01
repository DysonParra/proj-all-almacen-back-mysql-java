/*
 * @overview        {Movimientos}
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
 * TODO: Description of {@code Movimientos}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"movimientos\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Movimientos implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdMovimiento;
    private Long intIdRemision;
    private String strNumeroDocumento;
    private Long intIdTipoDocumento;
    private Long intIdTipoMovimiento;
    private Long intIdEstadoMovimiento;
    private Long intIdConcepto;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaCreacion;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaAnulacion;
    private Long intIdBodega;
    private BigDecimal decSobreCosto;
    private BigDecimal decSobreCostoAplicadoProducto;
    private String strObservaciones;
    private String strUsuario;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;

}
