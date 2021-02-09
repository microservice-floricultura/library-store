package br.com.store.library.domain.dto.event;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class VoucherEvent {
    
    @JsonProperty("voucherNumber")
    private Long voucherNumber;
    
    @JsonProperty("previsionToDelivery")
	private LocalDate previsionToDelivery;
}
