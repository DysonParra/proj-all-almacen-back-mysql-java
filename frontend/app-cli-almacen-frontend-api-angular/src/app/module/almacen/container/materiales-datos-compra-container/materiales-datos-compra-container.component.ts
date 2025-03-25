/*
 * @fileoverview    {MaterialesDatosCompraContainerComponent}
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
import { MaterialesDatosCompraViewModel } from '../../model/materiales-datos-compra.model';
import { MaterialesDatosCompraFacade } from '../../facade/materiales-datos-compra.facade';

/**
 * TODO: Description of {@code MaterialesDatosCompraContainerComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-materiales-datos-compra-container',
    templateUrl: './materiales-datos-compra-container.component.html',
    standalone: false,
    styleUrls: ['./materiales-datos-compra-container.component.css']
})
export class MaterialesDatosCompraContainerComponent extends GenericContainerComponent<MaterialesDatosCompraViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: MaterialesDatosCompraViewModel,
        entityFacade: MaterialesDatosCompraFacade) {
        super(entityInstance, entityFacade);
    }

}
