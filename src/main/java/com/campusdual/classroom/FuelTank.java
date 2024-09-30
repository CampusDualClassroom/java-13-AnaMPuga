package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 15;

  public void setActualFuel(int actualFuel) {

    if (actualFuel==0){
      this.actualFuel = actualFuel;

    }else {
      System.out.println("El fuel no puede ser negativo.");
    }
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
}
