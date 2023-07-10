/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author PC
 */
@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El bucketname es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "techshop-7816f.appspot.com";
    
    //Esta es la ruta basica de este proyecto tiendaproyecto
    final String rutaSuperiorStorage = "tiendaProyecto";
    
    //Ubicaciion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-7816f-firebase-adminsdk-9i4z3-808ddfaa0b";
}
