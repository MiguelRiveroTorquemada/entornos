package com.sanvalero.restaurante;

public class Menu{
        private String nombre;
        private int precio;
        private String descripcion;
        private String foto;
        private String ingredientes;
        private boolean disponibilidad;

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getPrecio(){
            return precio;
        }
        public void setPrecio(int precio){
            this.precio = precio;
        }

        public String getDescripcion(){
            return descripcion;
        }
        public void setDescripcion(String descripcion){
           this.descripcion = descripcion;
        }
        
        public String getFoto(){
            return foto;
        }
        public void setFoto(String foto){
            this.foto = foto;
        }
        
        public String getIngredientes(){
            return ingredientes;
        }
        public void setIngredientes(String ingredientes){
            this.ingredientes = ingredientes;
        }
        
        public boolean getDisponibilidad(){
            return disponibilidad;
        }
        public void setDisponibilidad(boolean disponibilidad){
            this.disponibilidad = disponibilidad;
        }
}