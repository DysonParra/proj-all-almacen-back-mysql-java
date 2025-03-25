/*
 * @fileoverview    {UnidadMedidaContainerComponent}
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
import { Component } from '@angular/core';
import { GenericContainerComponent } from '@app/module/essential/container/generic-container.component';
import { UnidadMedidaViewModel } from '../../model/unidad-medida.model';
import { UnidadMedidaFacade } from '../../facade/unidad-medida.facade';

/**
 * TODO: Description of {@code UnidadMedidaContainerComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-unidad-medida-container',
    templateUrl: './unidad-medida-container.component.html',
    standalone: false,
    styleUrls: ['./unidad-medida-container.component.css']
})
export class UnidadMedidaContainerComponent extends GenericContainerComponent<UnidadMedidaViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: UnidadMedidaViewModel,
        entityFacade: UnidadMedidaFacade) {
        super(entityInstance, entityFacade);
    }

}
