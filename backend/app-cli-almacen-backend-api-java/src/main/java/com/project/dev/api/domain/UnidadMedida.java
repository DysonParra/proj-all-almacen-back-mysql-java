/*
 * @overview        {UnidadMedida}
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
 * TODO: Description of {@code UnidadMedida}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"unidad_medida\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class UnidadMedida implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdUnidadMedida;
    private String strNombre;
    private String strSimbolo;
    private Float fltFactor;
    private Float fltPrecision;
    private Float fltConversion;
    private Integer intDecimales;
    private Boolean bitActivo;
    private String strUsuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    private Long intIdTipoUnidadMedida;

}
