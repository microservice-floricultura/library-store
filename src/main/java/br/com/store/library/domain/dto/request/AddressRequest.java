package br.com.store.library.domain.dto.request;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class AddressRequest {
    
    @NotNull(message="O campo 'address' é obrigatório no corpo da requisição")
    private String address;
    
    @NotNull(message="O campo 'number' é obrigatório no corpo da requisição")
    private Long number;

    @NotNull(message="O campo 'neighborhood' é obrigatório no corpo da requisição")
    private Long neighborhood;
    
    @NotNull(message="O campo 'city' é obrigatório no corpo da requisição")
    private Long city;

    @NotNull(message="O campo 'states' é obrigatório no corpo da requisição")
    private String states;

    @NotNull(message="O campo 'complement' é obrigatório no corpo da requisição")
    private String complement;
}
