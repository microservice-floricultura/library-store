package br.com.store.library.domain.dto.event;

import lombok.Getter;

@Getter
public class ProviderRequestEvent implements EventMessage {


    private static final long serialVersionUID = 1L;
    private String states;

    public ProviderRequestEvent(String states){
        super();
        this.states=states;
    }

    
}
