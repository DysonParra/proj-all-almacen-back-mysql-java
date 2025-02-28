/*
 * @fileoverview    {Saldos}
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
 * TODO: Description of {@code Saldos}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"Saldos\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Saldos implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdSaldo;
    @Column(precision = 10, scale = 2)
    private BigDecimal decCantidad;
    @Column(length = 255)
    private String strUsuario;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    @JoinColumn(name = "intIdEstadoSaldo", referencedColumnName = "intIdEstadoSaldo")
    private Long intIdEstadoSaldo;
    @JoinColumn(name = "strCodigoProducto", referencedColumnName = "strCodigoMaterial")
    private String strCodigoProducto;
    @JoinColumn(name = "intIdUbicacion", referencedColumnName = "intIdUbicacion")
    private Long intIdUbicacion;

}
