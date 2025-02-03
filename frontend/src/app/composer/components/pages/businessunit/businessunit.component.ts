import { Component, OnInit } from '@angular/core';
import { BusinessUnit } from 'src/app/composer/api/businessunit';
import { MessageService } from 'primeng/api';
import { Table } from 'primeng/table';
import { BusinessUnitService } from 'src/app/composer/service/businessunit.service';

@Component({
    templateUrl: './businessunit.component.html',
    providers: [MessageService]
})
export class BusinessUnitComponent implements OnInit {

    businessUnitDialog: boolean = false;

    deleteBusinessUnitDialog: boolean = false;

    deleteBusinessUnitsDialog: boolean = false;

    businessUnits: BusinessUnit[] = [];

    businessUnit: BusinessUnit = {};

    selectedBusinessUnits: BusinessUnit[] = [];

    submitted: boolean = false;

    cols: any[] = [];

    statuses: any[] = [];

    rowsPerPageOptions = [5, 10, 20];

    constructor(private businessUnitService: BusinessUnitService, private messageService: MessageService) { }

    ngOnInit() {
        this.getAll();

        this.cols = [
            { field: 'name', header: 'Name' },
            { field: 'acronym', header: 'Acronym' },
            { field: 'description', header: 'Description' }
        ];

    }

    getAll(): void {
        this.businessUnitService.getAll().subscribe({
          next: (data) => {
              this.businessUnits = data;
          },
          error: (e) => console.error(e)
        });
    }

    openNew() {
        this.businessUnit = {};
        this.submitted = false;
        this.businessUnitDialog = true;
    }

    editBusinessUnit(BusinessUnit: BusinessUnit) {
        this.businessUnit = { ...BusinessUnit };
        this.businessUnitDialog = true;
    }

    deleteBusinessUnit(BusinessUnit: BusinessUnit) {
        this.deleteBusinessUnitDialog = true;
        this.businessUnit = { ...BusinessUnit };
    }

    confirmDelete() {
        this.deleteBusinessUnitDialog = false;
 
        this.businessUnitService.delete(this.businessUnit.id).subscribe({
            next: () => {
                this.getAll();
                this.messageService.add({ severity: 'success', summary: 'Successful', detail: 'Business Unit Deleted', life: 3000 });
                this.businessUnit = {};
            },
            error: (e) => console.error(e)
        });
    
    }

    hideDialog() {
        this.businessUnitDialog = false;
        this.submitted = false;
    }

    saveBusinessUnit() {
        this.submitted = true;

        if (this.businessUnit.name?.trim()) {
            if (this.businessUnit.id) {
                this.businessUnitService.update(this.businessUnit.id, this.businessUnit).subscribe({
                    next: (data) => {
                        this.businessUnit = data;
                        this.businessUnits[this.findIndexById(this.businessUnit.id)] = this.businessUnit;
                        this.messageService.add({ severity: 'success', summary: 'Successful', detail: 'Business Unit Updated', life: 3000 });
                    },
                    error: (e) => console.error(e)
                });
            } else {
                this.businessUnitService.create(this.businessUnit).subscribe({
                    next: () => {
                        this.getAll();
                        this.messageService.add({ severity: 'success', summary: 'Successful', detail: 'BusinessUnit Created', life: 3000 });
                        this.businessUnit = {};
                    },
                    error: (e) => console.error(e)
                });
            }

            this.businessUnitDialog = false;
        }
    }

    findIndexById(id: string): number {
        let index = -1;
        for (let i = 0; i < this.businessUnits.length; i++) {
            if (this.businessUnits[i].id === id) {
                index = i;
                break;
            }
        }

        return index;
    }

    onGlobalFilter(table: Table, event: Event) {
        table.filterGlobal((event.target as HTMLInputElement).value, 'contains');
    }
}
