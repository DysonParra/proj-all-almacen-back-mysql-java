/*
 * @overview        {MmTmcCaracteristicaRestAssembler}
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
package com.project.dev.api.web.rest.assembler;

import com.project.dev.api.dto.MmTmcCaracteristicaDTO;
import com.project.dev.api.web.rest.MmTmcCaracteristicaRest;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * TODO: Description of {@code MmTmcCaracteristicaRestAssembler}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Component
public class MmTmcCaracteristicaRestAssembler implements RepresentationModelAssembler<MmTmcCaracteristicaDTO, EntityModel<MmTmcCaracteristicaDTO>> {

    /**
     * Convierte un DTO en un modelo.
     *
     * @param entityDTO DTO a convertir.
     * @return el modelo correspondiente al DTO:
     */
    @Override
    public EntityModel<MmTmcCaracteristicaDTO> toModel(MmTmcCaracteristicaDTO entityDTO) {
        return new EntityModel<>(entityDTO,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(MmTmcCaracteristicaRest.class).getEntity(String.valueOf(entityDTO.getIntIdMmTmcCaracteristica()))).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(MmTmcCaracteristicaRest.class).getAllEntities()).withRel("MmTmcCaracteristica"));
    }
}
