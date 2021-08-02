import {NgModule} from '@angular/core';

import {ListComponent} from './list/list.component';
import {CreateComponent} from './create/create.component';
import {EditComponent} from './edit/edit.component';
import {RouterModule, Routes} from '@angular/router';


const routes: Routes = [
  {
    path: 'customer',
    component: ListComponent
  },
  {
    path: 'customer/create',
    component: CreateComponent
  },
  {
    path: 'customer/edit/:id',
    component: EditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
