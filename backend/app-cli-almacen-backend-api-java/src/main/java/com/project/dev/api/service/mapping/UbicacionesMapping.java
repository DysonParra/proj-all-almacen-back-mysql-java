/*
 * @fileoverview    {UbicacionesMapping}
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
package com.project.dev.api.service.mapping;

import com.project.dev.api.domain.Ubicaciones;
import com.project.dev.api.dto.UbicacionesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Description of {@code UbicacionesMapping}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UbicacionesMapping extends GenericMapping<UbicacionesDTO, Ubicaciones> {

    /**
     * Obtiene una entidad en base a su DTO usando el campo clave de la base de datos.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    @Mapping(source = "intIdUbicacion", target = "intIdUbicacion")
    @Override
    public Ubicaciones getEntity(UbicacionesDTO dto);

    /**
     * Obtiene un DTO en base a su entidad usando el campo clave de la base de datos.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el dto equivalente a la entidad.
     */
    @Mapping(source = "intIdUbicacion", target = "intIdUbicacion")
    @Override
    public UbicacionesDTO getDto(Ubicaciones entity);

    /**
     * TODO: Description of method {@code withId}.
     *
     * @param strId
     * @return
     */
    public default Ubicaciones withId(String strId) {
        if (strId == null) {
            return null;
        }
        Ubicaciones entity = new Ubicaciones();
        entity.setIntIdUbicacion(Long.parseLong(strId));
        return entity;
    }
}
