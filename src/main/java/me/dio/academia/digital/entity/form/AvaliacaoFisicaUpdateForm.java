package me.dio.academia.digital.entity.form;

import javax.validation.constraints.Positive;

public class AvaliacaoFisicaUpdateForm {

  @Positive(message = "Valor inválido!")
  private double peso;

  @Positive(message = "Valor inválido!")
  private double altura;
}
