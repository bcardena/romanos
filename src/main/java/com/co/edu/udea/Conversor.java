package com.co.edu.udea;

public class Conversor {

    public String convertirARomano(int numeroAConvertir) {
        String romano ="";
        String Base1 = "I";
        String Base5 = "V";
        String Base10 = "X";
        if (numeroAConvertir > 0 && numeroAConvertir <=3){
            for (int i = 0 ; i < numeroAConvertir; i ++){
                romano = romano + Base1;
            }
        }
        else if (numeroAConvertir == 4) {
            romano = Base1 + Base5;
        }
        else  if (numeroAConvertir > 4 && numeroAConvertir <=8){
            romano = Base5;
            for (int i = 5 ; i < numeroAConvertir; i ++){
                romano = romano + Base1;
            }
        }
        else  if (numeroAConvertir == 9) {
            romano = Base1 + Base10;
        }
        else if (numeroAConvertir > 9 && numeroAConvertir <=13) {
            romano = Base10;
            for (int i = 10; i < numeroAConvertir; i++) {
                romano = romano + Base1;
            }
        }
        else if(numeroAConvertir == 14){
            romano = Base10 + Base1 + Base5;
        }
        else if (numeroAConvertir > 14 && numeroAConvertir <=18) {
            romano = Base10 + Base5 ;
            for (int i = 15; i < numeroAConvertir; i++) {
                romano = romano + Base1;
            }
        }
        else if(numeroAConvertir == 19){
            romano = Base10 + Base1 + Base10;
        }
        else if (numeroAConvertir > 19 && numeroAConvertir <=23) {
            romano = Base10 + Base10 ;
            for (int i = 20; i < numeroAConvertir; i++) {
                romano = romano + Base1;
            }
        }
        else if(numeroAConvertir == 24){
            romano = Base10 + Base10 + Base1 + Base5;
        }
        else if (numeroAConvertir > 24 && numeroAConvertir <=28) {
            romano = Base10 + Base10 + Base5 ;
            for (int i = 25; i < numeroAConvertir; i++) {
                romano = romano + Base1;
            }
        }
        else if(numeroAConvertir == 29){
            romano = Base10 + Base10 + Base1 + Base10;
        }
        else if(numeroAConvertir == 30){
            romano = Base10 + Base10 + Base10;
        }
        else romano = "Número no permitido";
        return romano;
    }
}
