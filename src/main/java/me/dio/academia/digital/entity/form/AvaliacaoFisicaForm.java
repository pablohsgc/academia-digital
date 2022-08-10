package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "Preencha corretamente o id!")
  private Long alunoId;

  @Positive(message = "Valor inválido!")
  private double peso;

  @Positive(message = "Valor inválido!")
  private double altura;
}
