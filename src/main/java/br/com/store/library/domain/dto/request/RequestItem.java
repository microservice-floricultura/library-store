package br.com.store.library.domain.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RequestItem {
 
    @NotNull(message="O campo 'address' é obrigatório no corpo da requisição")
    private Long productId;
    @Min(value = 0,message = "O campo 'quantity' está com valor mínimo inválido")
    @Max(value=9999999,message="O campo 'quantity' está com valor máximo")
    private int quantity;
    
}
