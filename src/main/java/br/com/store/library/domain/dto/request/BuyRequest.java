package br.com.store.library.domain.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class BuyRequest {
    
    @NotNull(message="O campo 'address' é obrigatório no corpo da requisição")
    private AddressRequest address;

    @NotNull(message="O campo 'listItem' é obrigatório no corpo da requisição")
    private List<RequestItem> listItem;
}
