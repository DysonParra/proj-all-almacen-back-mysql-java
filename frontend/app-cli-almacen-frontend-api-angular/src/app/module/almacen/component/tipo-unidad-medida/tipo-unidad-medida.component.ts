/*
 * @overview        {TipoUnidadMedidaComponent}
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
import { GenericComponent } from '@app/module/essential/component/generic.component';
import { TipoUnidadMedidaViewModel } from '../../model/tipo-unidad-medida.model';

/**
 * TODO: Description of {@code TipoUnidadMedidaComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-tipo-unidad-medida',
    templateUrl: './tipo-unidad-medida.component.html',
    standalone: false,
    styleUrls: ['./tipo-unidad-medida.component.css']
})
export class TipoUnidadMedidaComponent extends GenericComponent<TipoUnidadMedidaViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: TipoUnidadMedidaViewModel) {
        super(entityInstance);
    }

}
