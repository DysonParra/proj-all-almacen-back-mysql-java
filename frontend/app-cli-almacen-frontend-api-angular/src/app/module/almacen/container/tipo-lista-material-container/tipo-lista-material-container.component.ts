/*
 * @overview        {TipoListaMaterialContainerComponent}
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
import { TipoListaMaterialViewModel } from '../../model/tipo-lista-material.model';
import { TipoListaMaterialFacade } from '../../facade/tipo-lista-material.facade';

/**
 * TODO: Description of {@code TipoListaMaterialContainerComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-tipo-lista-material-container',
    templateUrl: './tipo-lista-material-container.component.html',
    standalone: false,
    styleUrls: ['./tipo-lista-material-container.component.css']
})
export class TipoListaMaterialContainerComponent extends GenericContainerComponent<TipoListaMaterialViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: TipoListaMaterialViewModel,
        entityFacade: TipoListaMaterialFacade) {
        super(entityInstance, entityFacade);
    }

}
