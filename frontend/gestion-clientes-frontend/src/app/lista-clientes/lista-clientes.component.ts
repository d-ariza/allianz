import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-lista-clientes',
  templateUrl: './lista-clientes.component.html',
  styleUrls: ['./lista-clientes.component.css']
})
export class ListaClientesComponent implements OnInit{
   clientes:Cliente[];

   constructor(private clientesServicio:ClienteService){}
   ngOnInit(): void{
    this.obtenerClientes();

   }

   private obtenerClientes(){
    this.clientesServicio.obtenerListaDeClientes().subscribe(dato => {
      this.clientes = dato;
    })
   }
}
