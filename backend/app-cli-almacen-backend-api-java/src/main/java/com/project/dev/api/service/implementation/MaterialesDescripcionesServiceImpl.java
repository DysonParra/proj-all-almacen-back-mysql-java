/*
 * @overview        {MaterialesDescripcionesServiceImpl}
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
package com.project.dev.api.service.implementation;

import com.project.dev.api.domain.MaterialesDescripciones;
import com.project.dev.api.dto.MaterialesDescripcionesDTO;
import com.project.dev.api.repository.MaterialesDescripcionesRepository;
import com.project.dev.api.service.GenericService;
import com.project.dev.api.service.exception.EntityNotFoundException;
import com.project.dev.api.service.mapping.MaterialesDescripcionesMapping;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO: Description of {@code MaterialesDescripcionesServiceImpl}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Transactional
@org.springframework.stereotype.Service
public class MaterialesDescripcionesServiceImpl implements GenericService<MaterialesDescripcionesDTO> {

    private final Logger log = LoggerFactory.getLogger(MaterialesDescripcionesServiceImpl.class);
    private final MaterialesDescripcionesRepository entityRepository;
    private final MaterialesDescripcionesMapping entityMapping = Mappers.getMapper(MaterialesDescripcionesMapping.class);

    /**
     * Constructor.
     *
     * @param entityRepository el repositorio de la entidad.
     */
    public MaterialesDescripcionesServiceImpl(MaterialesDescripcionesRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    /**
     * Obtiene todas las entidades existentes.
     *
     * @return lista de entidades almacenadas en la base de datos.
     * @throws Exception en caso de ocurrir algún error.
     */
    @Override
    public List<MaterialesDescripcionesDTO> getAllEntities() throws Exception {
        log.debug("Solicitud para listar todas las Entidades tipo MaterialesDescripciones");
        return entityMapping.getDto(entityRepository.findAll());
    }

    /**
     * Obtiene todos los registros según la paginación suministrada.
     *
     * @param pageable indica la manera en que se paginarán los registros obtenidos.
     * @return entidades almacenadas en base de datos de forma paginada.
     * @throws Exception en caso de ocurrir algún error.
     */
    @Override
    public Page<MaterialesDescripcionesDTO> getAllEntitiesPaged(Pageable pageable) throws Exception {
        log.debug("Solicitud para listar todas las Entidades tipo MaterialesDescripciones con paginación");
        return entityRepository.findAll(pageable).map(entityMapping::getDto);
    }

    /**
     * Guarda o actualiza los datos de una entidad.
     *
     * @param entityDTO entidad que va a ser almacenada.
     * @return entidad almacenada en la base de datos.
     * @throws Exception en caso de ocurrir algún error.
     */
    @Override
    public MaterialesDescripcionesDTO saveUpdate(MaterialesDescripcionesDTO entityDTO) throws Exception {
        log.debug("Solicitud para guardar la entidad tipo MaterialesDescripciones: {}", entityDTO);

        //TODO: agregar validación específica del servicio.
        MaterialesDescripciones entity = entityMapping.getEntity(entityDTO);
        entity = entityRepository.save(entity);

        MaterialesDescripcionesDTO dto = entityMapping.getDto(entity);
        return dto;
    }

    /**
     * Obtiene la entidad usando el ID suministrado.
     *
     * @param id es el identificador de la entidad.
     * @return entidad almacenada en la base de datos.
     * @throws Exception en caso de ocurrir algún error.
     */
    @Override
    public MaterialesDescripcionesDTO getEntity(String id) throws Exception {
        log.debug("Solicitud para buscar la Entidad tipo MaterialesDescripciones: {}", id);
        MaterialesDescripciones searchedEntity = entityRepository.findById(Long.parseLong(id))
                .orElseThrow(() -> new EntityNotFoundException(id));
        return entityMapping.getDto(searchedEntity);
    }

    /**
     * Elimina los datos de una entidad.
     *
     * @param id identificador de la entidad que va a ser eliminada.
     * @throws Exception en caso de ocurrir algún error.
     */
    @Override
    public void deleteEntity(String id) throws Exception {
        log.debug("Solicitud para eliminar la entidad tipo MaterialesDescripciones: {}", id);
        entityRepository.deleteById(Long.parseLong(id));
    }

    /**
     * Obtiene registros de la base de datos según la búsqueda suministrada.
     *
     * @param query indica la búsqueda que se hará en la base de datos.
     * @return entidades almacenadas en base de datos encontradas.
     * @throws Exception en caso de ocurrir algún error.
     */
    @Override
    public List<MaterialesDescripcionesDTO> searchEntities(String query) throws Exception {
        log.debug("Solicitud para listar todas las Entidades tipo MaterialesDescripciones: {}", query);
        return entityMapping.getDto(entityRepository.searchEntities(query));
    }

    /**
     * Obtiene registros de la base de datos según la búsqueda y la paginación que se indicaron.
     *
     * @param query    indica la búsqueda que se hará en la base de datos.
     * @param pageable indica la manera en que se paginarán los registros obtenidos.
     * @return entidades almacenadas en base de datos encontradas.
     */
    @Transactional(readOnly = true)
    @Override
    public Page<MaterialesDescripcionesDTO> searchEntitiesPaged(String query, Pageable pageable) {
        log.debug("Solicitud para buscar una pagina de la entidad tipo MaterialesDescripciones para consulta {}", query);
        return entityRepository.searchEntities(query, pageable).map(entityMapping::getDto);
    }
}
