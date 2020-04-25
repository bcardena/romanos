package com.co.edu.udea;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestConversor {
    Conversor conversor;

    @Before
    public void setup(){
        conversor = new Conversor();
    }

    @After
    public void tearDown(){
        String esperado = "";
        String obtenido= "";
    }

    @Test
    public void cuandoReciba1DebeRetornarI(){
        //Arrange
        String esperado = "I";
        String obtenido;
        int numeroAConvertir = 1;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

    @Test
    public void cuandoReciba2DebeRetornarII(){
        //Arrange
        String esperado = "II";
        String obtenido;
        int numeroAConvertir = 2;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba3DebeRetornarIII(){
        //Arrange
        String esperado = "III";
        String obtenido;
        int numeroAConvertir = 3;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

    @Test
    public void cuandoReciba4DebeRetornarIV(){
        //Arrange
        String esperado = "IV";
        String obtenido;
        int numeroAConvertir = 4;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

    @Test
    public void cuandoReciba5DebeRetornarV(){
        //Arrange
        String esperado = "V";
        String obtenido;
        int numeroAConvertir = 5;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba6DebeRetornarVI(){
        //Arrange
        String esperado = "VI";
        String obtenido;
        int numeroAConvertir = 6;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba7DebeRetornarVII(){
        //Arrange
        String esperado = "VII";
        String obtenido;
        int numeroAConvertir = 7;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba8DebeRetornarVIII(){
        //Arrange
        String esperado = "VIII";
        String obtenido;
        int numeroAConvertir = 8;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

    @Test
    public void cuandoReciba9DebeRetornarIX(){
        //Arrange
        String esperado = "IX";
        String obtenido;
        int numeroAConvertir = 9;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

    @Test
    public void cuandoReciba10DebeRetornarX(){
        //Arrange
        String esperado = "X";
        String obtenido;
        int numeroAConvertir = 10;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba11DebeRetornarXI(){
        //Arrange
        String esperado = "XI";
        String obtenido;
        int numeroAConvertir = 11;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba12DebeRetornarXII(){
        //Arrange
        String esperado = "XII";
        String obtenido;
        int numeroAConvertir = 12;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba13DebeRetornarXIII(){
        //Arrange
        String esperado = "XIII";
        String obtenido;
        int numeroAConvertir = 13;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba14DebeRetornarXIV(){
        //Arrange
        String esperado = "XIV";
        String obtenido;
        int numeroAConvertir = 14;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba15DebeRetornarXV(){
        //Arrange
        String esperado = "XV";
        String obtenido;
        int numeroAConvertir = 15;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba16DebeRetornarXVI(){
        //Arrange
        String esperado = "XVI";
        String obtenido;
        int numeroAConvertir = 16;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba17DebeRetornarXVII(){
        //Arrange
        String esperado = "XVII";
        String obtenido;
        int numeroAConvertir = 17;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba18DebeRetornarXVIII(){
        //Arrange
        String esperado = "XVIII";
        String obtenido;
        int numeroAConvertir = 18;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

    @Test
    public void cuandoReciba19DebeRetornarXIV(){
        //Arrange
        String esperado = "XIX";
        String obtenido;
        int numeroAConvertir = 19;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba20DebeRetornarXX(){
        //Arrange
        String esperado = "XX";
        String obtenido;
        int numeroAConvertir = 20;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba21DebeRetornarXXI(){
        //Arrange
        String esperado = "XXI";
        String obtenido;
        int numeroAConvertir = 21;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba22DebeRetornarXXII(){
        //Arrange
        String esperado = "XXII";
        String obtenido;
        int numeroAConvertir = 22;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba23DebeRetornarXXIII(){
        //Arrange
        String esperado = "XXIII";
        String obtenido;
        int numeroAConvertir = 23;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba24DebeRetornarXXIV(){
        //Arrange
        String esperado = "XXIV";
        String obtenido;
        int numeroAConvertir = 24;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba25DebeRetornarXXV(){
        //Arrange
        String esperado = "XXV";
        String obtenido;
        int numeroAConvertir = 25;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba26DebeRetornarXXVI(){
        //Arrange
        String esperado = "XXVI";
        String obtenido;
        int numeroAConvertir = 26;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba27DebeRetornarXXVII(){
        //Arrange
        String esperado = "XXVII";
        String obtenido;
        int numeroAConvertir = 27;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba28DebeRetornarXXVIII(){
        //Arrange
        String esperado = "XXVIII";
        String obtenido;
        int numeroAConvertir = 28;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba29DebeRetornarXXIX(){
        //Arrange
        String esperado = "XXIX";
        String obtenido;
        int numeroAConvertir = 29;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void cuandoReciba30DebeRetornarXXX(){
        //Arrange
        String esperado = "XXX";
        String obtenido;
        int numeroAConvertir = 30;
        //Act
        obtenido = conversor.convertirARomano(numeroAConvertir);
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }

}
