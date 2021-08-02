import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListComponent} from './customer/list/list.component';
import {CreateComponent} from './customer/create/create.component';
import {UpdateComponent} from './customer/update/update.component';


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
    path: 'customer/update/:id',
    component: UpdateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
