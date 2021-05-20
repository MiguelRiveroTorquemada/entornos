package com.sanvalero.restaurante;

public class Restaurante{
        private String nombre;
        private String descripcion;
        private String tipo;
        private String direccion;
        private String horario;

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getDescripcion(){
            return descripcion;
        }
        public void setDescripcion(String descripcion){
                this.descripcion = descripcion;
        }

        public String getTipo(){
           return tipo;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
        }
        
        public String getDireccion(){
           return direccion;
        }
        public void setDireccion(String tipo){
            this.direccion = direccion;
        }
        
        public String getHorario(){
           return horario;
        }
        public void setHorario(String horario){
            this.horario = horario;
        }
}