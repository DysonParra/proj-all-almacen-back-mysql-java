/*
 * @overview        {MaterialesDatosCompra}
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
 * TODO: Description of {@code MaterialesDatosCompra}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"materiales_datos_compra\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class MaterialesDatosCompra implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdMaterialDatoCompra;
    private String strCodigoMaterialCompra;
    private String strCodigoMaterial;
    private Boolean bitAutomaticPurchase;
    private Boolean bitGestionLotes;
    private BigDecimal decToleranciaEntregaInferior;
    private BigDecimal decToleranciaEntregaSuperior;
    private Integer intDiasEntrega;
    private Boolean bitRequiereInspeccion;
    private String strUsuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    private Long intIdUnidadMedidaBase;
    private Long intIdUnidadMedidaCompra;
    private Long intIdMaterial;
    private Long intIdInterlocutor;

}
