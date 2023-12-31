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

import com.proyecto.demo.DTO.ParticipanteDTO;
import com.proyecto.demo.service.impl.ServiceImplParticipante;

@RestController
@RequestMapping("/participante")

public class ControllerParticipante {
        @Autowired
    @Qualifier("participanteServiceImpl")
    private ServiceImplParticipante serviceImplParticipante;


    @GetMapping("/list")
    public List<ParticipanteDTO> getAll(){
        return serviceImplParticipante.getAll();
        
    }

    @GetMapping("/get/{id}")
    public ParticipanteDTO get(@PathVariable int id){
        return serviceImplParticipante.getById(id);
    }


    @PostMapping("/agregar")
    public ParticipanteDTO create(@RequestBody ParticipanteDTO participanteDTO ){


        return serviceImplParticipante.create(participanteDTO);
    }

    @PutMapping("/editar/{id}")
    public ParticipanteDTO editarEs(@PathVariable int id, @RequestBody ParticipanteDTO participanteDTO ){

        return serviceImplParticipante.update(id, participanteDTO);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id){
        serviceImplParticipante.delete(id);
    }






    
    
}
