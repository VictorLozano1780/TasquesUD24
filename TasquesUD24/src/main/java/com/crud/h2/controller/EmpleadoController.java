package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Empleado;
import com.crud.h2.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServideImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarClientes(){
		return empleadoServideImpl.listarEmpleados();
	}
	
	//listar Clientes por campo nombre
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarClienteNombre(@PathVariable(name="nombre") String nombre) {
	    return empleadoServideImpl.listarEmpleadoNombre(nombre);
	}
	
	
	@PostMapping("/empleados")
	public Empleado salvarCliente(@RequestBody Empleado cliente) {
		
		return empleadoServideImpl.guardarEmpleado(cliente);
	}
	
	
	@GetMapping("/empleados/{id}")
	public Empleado clienteXID(@PathVariable(name="id") Long id) {
		
		Empleado empleado_xid= new Empleado();
		
		empleado_xid=empleadoServideImpl.empleadoXID(id);
		
		System.out.println("Empleado XID: "+empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Empleado cliente) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServideImpl.empleadoXID(id);
		
		empleado_seleccionado.setNombre(cliente.getNombre());
		empleado_seleccionado.setApellido(cliente.getApellido());
		empleado_seleccionado.setTrabajo(cliente.getTrabajo());
		empleado_seleccionado.setSalario(cliente.getSalario());
		empleado_seleccionado.setFecha(cliente.getFecha());
		
		empleado_actualizado = empleadoServideImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarCliente(@PathVariable(name="id")Long id) {
		empleadoServideImpl.eliminarEmpleado(id);
	}
	
	
}
