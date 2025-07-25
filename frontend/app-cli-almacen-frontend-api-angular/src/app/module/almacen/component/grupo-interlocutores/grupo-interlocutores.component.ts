/*
 * @overview        {GrupoInterlocutoresComponent}
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
import { GrupoInterlocutoresViewModel } from '../../model/grupo-interlocutores.model';

/**
 * TODO: Description of {@code GrupoInterlocutoresComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-grupo-interlocutores',
    templateUrl: './grupo-interlocutores.component.html',
    standalone: false,
    styleUrls: ['./grupo-interlocutores.component.css']
})
export class GrupoInterlocutoresComponent extends GenericComponent<GrupoInterlocutoresViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: GrupoInterlocutoresViewModel) {
        super(entityInstance);
    }

}
