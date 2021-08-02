import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {Customer} from '../../model/customer';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  customerList: Customer[];
  page = 1;
  nameSearch = '';
  emailSearch = '';

  constructor(private sv: CustomerService) {

  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.sv.getAll().subscribe(c => {
      this.customerList = c;
    });
  }

  delete(id: number) {
    const swalWithBootstrapButtons = Swal.mixin({
      customClass: {
        confirmButton: 'btn btn-success',
        cancelButton: 'btn btn-danger'
      },
      buttonsStyling: false
    });

    swalWithBootstrapButtons.fire({
      title: 'Are you sure?',
      text: 'You won\'t be able to revert this!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, cancel!',
      reverseButtons: true
    }).then((result) => {
      if (result.isConfirmed) {
        this.sv.delete(id).subscribe(() => {
          this.getAll();
        });
        swalWithBootstrapButtons.fire(
          'Deleted!',
          'Your file has been deleted.',
          'success'
        );
      } else if (
        /* Read more about handling dismissals below */
        result.dismiss === Swal.DismissReason.cancel
      ) {
        swalWithBootstrapButtons.fire(
          'Cancelled',
          'Your imaginary file is safe :)',
          'error'
        );
      }
    });
  }

  search() {
    this.sv.search(this.nameSearch, this.emailSearch).subscribe(c => {
      this.customerList = c;
      this.page = 1;
    });
  }
}
