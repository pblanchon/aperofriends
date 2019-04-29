package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.TypeItem;
import pco.aperofriends.repository.TypeItemRepository;

@Service
public class TypeItemServiceImpl implements TypeItemService{
	
	private TypeItemRepository typeItemRepository;
	
	public TypeItemServiceImpl(TypeItemRepository typeItemRepository) {
		this.typeItemRepository = typeItemRepository;
	}
	
	@Override
	public List<TypeItem> findAllTypeItems(){
		return typeItemRepository.findAll();
	}
	
	@Override
	public Optional<TypeItem> findItemByIdTypeItem(Integer idTypeItem) {
		return typeItemRepository.findById(idTypeItem);
	}
	
	@Override
    public TypeItem createTypeItem(TypeItem newTypeItem) {
        return typeItemRepository.save(newTypeItem);
    }
	
	@Override
    public TypeItem saveTypeItem(TypeItem typeItem) {
        return typeItemRepository.save(typeItem);
    }

}
