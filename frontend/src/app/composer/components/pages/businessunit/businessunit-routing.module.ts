import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { BusinessUnitComponent } from './businessunit.component';

@NgModule({
	imports: [RouterModule.forChild([
		{ path: '', component: BusinessUnitComponent }
	])],
	exports: [RouterModule]
})
export class BusinessUnitRoutingModule { }
