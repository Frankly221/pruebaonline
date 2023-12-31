package com.proyecto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.DTO.CursoArticuladoDTO;
import com.proyecto.demo.service.impl.ServiceImplCursoArticulado;

@RestController
@RequestMapping("/Curso_Articulado")
public class ControllerCursoArticulado {

        @Autowired
        @Qualifier("cursoarticuladoServiceImpl")
        private ServiceImplCursoArticulado serviceImplCursoArticulado;
    
      @GetMapping("/list")
    public List<CursoArticuladoDTO> getAllCursoArticulado() {
        return serviceImplCursoArticulado.getAll();
    }

    @GetMapping("/get/{id}")
    public CursoArticuladoDTO getCursoArticulado(@PathVariable int id) {
        return serviceImplCursoArticulado.getById(id);
    }


      
    @PostMapping("/agregar")
    public CursoArticuladoDTO create(@RequestBody CursoArticuladoDTO cursoArticuladoDTO) {
    return serviceImplCursoArticulado.create(cursoArticuladoDTO);
    }


    @PutMapping("/editar/{id}")
    public CursoArticuladoDTO updateCursoArticulado(@PathVariable int id, @RequestBody CursoArticuladoDTO cursoArticuladoDTO) {
        return serviceImplCursoArticulado.update(id, cursoArticuladoDTO);
    }


     @DeleteMapping("/eliminar/{id}")
    public void deleteCursoArticulado(@PathVariable int id) {
        serviceImplCursoArticulado.delete(id);
        
    }

































}
