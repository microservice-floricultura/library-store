package br.com.store.library.repository.command;

import org.springframework.stereotype.Repository;

import br.com.store.library.domain.Buy;
import br.com.store.library.repository.BaseRepositoryCommand;

@Repository
public interface BuyRepositoryCommand extends BaseRepositoryCommand<Buy,Long>{
    
}
