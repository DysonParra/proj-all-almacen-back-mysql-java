/*
 * @overview        {ListaDeMaterialesMapping}
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

import com.project.dev.api.domain.ListaDeMateriales;
import com.project.dev.api.dto.ListaDeMaterialesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Description of {@code ListaDeMaterialesMapping}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Mapper(componentModel = "spring")
public interface ListaDeMaterialesMapping extends GenericMapping<ListaDeMaterialesDTO, ListaDeMateriales> {

    /**
     * Obtiene una entidad con base en su DTO usando el campo clave de la base de datos.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    @Mapping(source = "intIdListaMaterial", target = "intIdListaMaterial")
    @Override
    public ListaDeMateriales getEntity(ListaDeMaterialesDTO dto);

    /**
     * Obtiene un DTO con base en su entidad usando el campo clave de la base de datos.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el DTO equivalente a la entidad.
     */
    @Mapping(source = "intIdListaMaterial", target = "intIdListaMaterial")
    @Override
    public ListaDeMaterialesDTO getDto(ListaDeMateriales entity);

    /**
     * Obtiene una entidad usando el ID suministrado.
     *
     * @param strId es el id de la entidad.
     * @return la entidad con el ID suministrado.
     */
    public default ListaDeMateriales withId(String strId) {
        if (strId == null) {
            return null;
        }
        ListaDeMateriales entity = new ListaDeMateriales();
        entity.setIntIdListaMaterial(Long.parseLong(strId));
        return entity;
    }
}
