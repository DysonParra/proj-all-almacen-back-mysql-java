/*
 * @overview        {GenericMapping}
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

import java.util.List;

/**
 * TODO: Description of {@code GenericMapping}.
 *
 * @param <D> tipo de dato del DTO.
 * @param <E> tipo de dato de la entidad.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public interface GenericMapping<D, E> {

    /**
     * Obtiene una entidad con base en su DTO.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    public E getEntity(D dto);

    /**
     * Obtiene un DTO con base en su entidad.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el DTO equivalente a la entidad.
     */
    public D getDto(E entity);

    /**
     * Obtiene una lista de entidades con base en una lista de DTO.
     *
     * @param dtoList es la lista de DTO a convertir en una lista de entidades.
     * @return la lista de entidades equivalente a la lista de dto.
     */
    public List<E> getEntity(List<D> dtoList);

    /**
     * Obtiene una lista de DTO con base en una lista de entidades.
     *
     * @param entityList es la lista de entidades a convertir en una lista de DTO.
     * @return la lista de dto equivalente a la lista de entidades.
     */
    public List<D> getDto(List<E> entityList);
}
