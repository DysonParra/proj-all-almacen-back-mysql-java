/*
 * @fileoverview    {ConsecutivosMapping}
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

import com.project.dev.api.domain.Consecutivos;
import com.project.dev.api.dto.ConsecutivosDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Description of {@code ConsecutivosMapping}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConsecutivosMapping extends GenericMapping<ConsecutivosDTO, Consecutivos> {

    /**
     * Obtiene una entidad en base a su DTO usando el campo clave de la base de datos.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    @Mapping(source = "intIdConsecutivo", target = "intIdConsecutivo")
    @Override
    public Consecutivos getEntity(ConsecutivosDTO dto);

    /**
     * Obtiene un DTO en base a su entidad usando el campo clave de la base de datos.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el dto equivalente a la entidad.
     */
    @Mapping(source = "intIdConsecutivo", target = "intIdConsecutivo")
    @Override
    public ConsecutivosDTO getDto(Consecutivos entity);

    /**
     * TODO: Description of method {@code withId}.
     *
     * @param strId
     * @return
     */
    public default Consecutivos withId(String strId) {
        if (strId == null) {
            return null;
        }
        Consecutivos entity = new Consecutivos();
        entity.setIntIdConsecutivo(Long.parseLong(strId));
        return entity;
    }
}
