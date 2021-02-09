package br.com.store.library.domain.dto.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RequestEvent {
    
    @JsonProperty("cdRequest")
    private Long cdRequest;
	
    @JsonProperty("timeToPrepare")
	private Integer timeToPrepare;
}
