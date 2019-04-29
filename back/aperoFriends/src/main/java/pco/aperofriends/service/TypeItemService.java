package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.TypeItem;

@Service
public interface TypeItemService {
	
	List<TypeItem> findAllTypeItems();
	
	Optional<TypeItem> findItemByIdTypeItem(Integer idTypeItem);
	
	TypeItem createTypeItem(TypeItem newTypeItem);
	
	TypeItem saveTypeItem(TypeItem typeItem);

}
