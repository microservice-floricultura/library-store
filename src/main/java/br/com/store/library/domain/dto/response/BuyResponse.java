package br.com.store.library.domain.dto.response;

import java.util.List;

import br.com.store.library.domain.dto.request.RequestItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class BuyResponse {
    

    private Long buyId;

    private List<RequestItem> listItem;
}
