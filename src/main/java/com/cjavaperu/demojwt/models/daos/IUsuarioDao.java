package com.cjavaperu.demojwt.models.daos;

import org.springframework.data.repository.CrudRepository;

import com.cjavaperu.demojwt.models.entities.Usuario;




public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

    public Usuario findByUsername(String username);
}
