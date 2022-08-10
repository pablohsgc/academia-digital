package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class AlunoUpdateForm {

  @NotBlank(message = "O Campo deve ser preenchido!")
  private String nome;

  @NotBlank(message = "O Campo deve ser preenchido!")
  private String bairro;

  @Past(message = "Data '${validatedValue} é inválida!'")
  private LocalDate dataDeNascimento;
}
